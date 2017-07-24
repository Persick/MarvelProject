package ru.dasha.marvelproject.api;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import ru.dasha.marvelproject.model.ResponseModel;

/***
 * This interface let us make request to API with some necessary parameters.
 */
public interface MarvelService {
    @GET("/v1/public/comics")
    Call<ResponseModel> getData(@Query("ts") String timestamp
            , @Query("apikey") String apikey
            , @Query("hash") String signature
            , @Query("dateRange") String date);
}
