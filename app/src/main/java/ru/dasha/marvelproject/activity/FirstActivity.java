package ru.dasha.marvelproject.activity;


import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

import ru.dasha.marvelproject.R;
import ru.dasha.marvelproject.api.Signature;

/***
 * This activity is the first. You need to click on "000000" to change dates (from and to). If you don't choose the date
 * it will be comics for last month.
 * When you click on button you'll go to MainActivity and you'll see comics.
 */

public class FirstActivity extends AppCompatActivity {
    int dialogId;
    int fromYear;
    int fromMonth;
    int fromDay;
    int toYear;
    int toMonth;
    int toDay;
    TextView from;
    TextView to;
    Button findButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        initAll();
    }

    public void onclick(View view) {
        if (view.equals(findButton)) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        } else if (view.equals(from)) {
            dialogId = 1;
            showDialog(dialogId);
        } else if (view.equals(to)) {
            dialogId = 2;
            showDialog(dialogId);
        }
    }

    protected Dialog onCreateDialog(int id) {
        if (id == 1) {
            DatePickerDialog tpd = new DatePickerDialog(this, myCallBack, fromYear, fromMonth, fromDay);
            return tpd;
        } else if (id == 2) {
            DatePickerDialog tpd = new DatePickerDialog(this, myCallBack, fromYear, fromMonth, fromDay);
            return tpd;
        }
        return super.onCreateDialog(id);
    }

    DatePickerDialog.OnDateSetListener myCallBack = new DatePickerDialog.OnDateSetListener() {

        public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
            if (dialogId == 1) {
                fromYear = year;
                fromMonth = monthOfYear;
                fromDay = dayOfMonth;
                from.setText(fromYear + "-" + (fromMonth + 1) + "-" + fromDay);
                Signature.setDateFrom(fromYear + "-" + fromMonth + "-" + fromDay);
            } else if (dialogId == 2) {
                toYear = year;
                toMonth = monthOfYear;
                toDay = dayOfMonth;
                to.setText(toYear + "-" + (toMonth + 1) + "-" + toDay);
                Signature.setDateTo(toYear + "-" + toMonth + "-" + toDay);
            }
        }
    };


    void initAll() {
        from = (TextView) findViewById(R.id.from);
        to = (TextView) findViewById(R.id.to);
        findButton = (Button) findViewById(R.id.findButton);
        fromYear = Signature.getCalendar().get(Calendar.YEAR);
        fromMonth = Signature.getCalendar().get(Calendar.MONTH);
        fromDay = Signature.getCalendar().get(Calendar.DAY_OF_MONTH) - 1;
        toYear = Signature.getCalendar().get(Calendar.YEAR);
        toMonth = Signature.getCalendar().get(Calendar.MONTH);
        toDay = Signature.getCalendar().get(Calendar.DAY_OF_MONTH);

    }
}
