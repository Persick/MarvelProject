package ru.dasha.marvelproject.activity;

import android.app.ProgressDialog;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import ru.dasha.marvelproject.adapters.ComicAdapter;
import ru.dasha.marvelproject.utils.InternetConnection;
import ru.dasha.marvelproject.api.MarvelService;
import ru.dasha.marvelproject.R;
import ru.dasha.marvelproject.api.Signature;
import ru.dasha.marvelproject.model.ResponseModel;
import ru.dasha.marvelproject.model.Result;

/***
 * This activity is general and you'll come here after FirstActivity.
 * We create an objects of classes retrofit and our MarvelService here, do request to API and get response.
 * Then we parse it into gson and show on layout title and description of comics.
 */
public class MainActivity extends AppCompatActivity {

    public static final String BASE_URL = "http://gateway.marvel.com";

    private static MarvelService marvelService;
    private Retrofit retrofit;
    private ComicAdapter adapter;
    private ArrayList<Result> resultList;
    private ListView listView;
    private View parentView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initAll();

        String ts = Signature.getTimeStamp();
        String apikey = Signature.PUBLIC_KEY;
        String hashSignature = Signature.getHashSignature();
        String date = Signature.getDate();

        //HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        //logging.setLevel(HttpLoggingInterceptor.Level.HEADERS);
        //OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        //httpClient.addInterceptor(logging);

        if (InternetConnection.checkConnection(getApplicationContext())) {
            final ProgressDialog dialog;
            dialog = new ProgressDialog(MainActivity.this);
            dialog.setTitle(getString(R.string.loading_json_title));
            dialog.setMessage(getString(R.string.loading_json_message));
            dialog.show();


            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    //.client(httpClient.build()) // network requests logging
                    .build();
            marvelService = retrofit.create(MarvelService.class);

            marvelService.getData(ts, apikey, hashSignature, date).enqueue(new Callback<ResponseModel>() {
                @Override
                public void onResponse(Call<ResponseModel> call, Response<ResponseModel> response) {
                    dialog.dismiss();

                    if (response.isSuccessful()) {
                        resultList = (ArrayList<Result>) response.body().getData().getResults();

                        if (response.body().getData().getTotal().equals("0")) {
                            Snackbar.make(parentView, R.string.change_dates, Snackbar.LENGTH_LONG).show();
                        }

                        adapter = new ComicAdapter(MainActivity.this, resultList);
                        listView.setAdapter(adapter);
                    } else {
                        Snackbar.make(parentView, R.string.something_wrong, Snackbar.LENGTH_LONG).show();
                    }

                }

                @Override
                public void onFailure(Call<ResponseModel> call, Throwable t) {
                    dialog.dismiss();
                    //Log.d("DEADBEEF", t.toString());
                }
            });
        } else {
            Snackbar.make(parentView, R.string.no_connection_to_internet, Snackbar.LENGTH_LONG).show();
        }
    }

    private void initAll() {
        resultList = new ArrayList<>();
        listView = (ListView) findViewById(R.id.listView);
        parentView = findViewById(R.id.parentLayout);
    }
}
