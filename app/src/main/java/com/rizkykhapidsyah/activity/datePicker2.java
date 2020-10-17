package com.rizkykhapidsyah.activity;

import androidx.appcompat.app.AppCompatActivity;

/* Created by Rizky Khapidsyah */

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.Toast;

import com.rizkykhapidsyah.R;

public class datePicker2 extends AppCompatActivity {

    int Year, month, day;
    static final int DATE_DIALOG_ID = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_picker2);
        showDialog(DATE_DIALOG_ID);
    }


    @Override
    protected Dialog onCreateDialog(int id) {
        switch (id) {
            case DATE_DIALOG_ID:
                return new DatePickerDialog(this, mDateSetListener, Year, month, day);
        }

        return null;
    }


    private DatePickerDialog.OnDateSetListener mDateSetListener = new DatePickerDialog.OnDateSetListener() {
        public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
            Year = year;
            month = monthOfYear;
            day = dayOfMonth;
            Toast.makeText(getBaseContext(), "You have selected : " + (month + 1) + "/" + day + "/" + Year, Toast.LENGTH_SHORT).show();
        }
    };

}