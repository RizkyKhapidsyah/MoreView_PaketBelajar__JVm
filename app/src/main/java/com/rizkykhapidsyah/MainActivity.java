package com.rizkykhapidsyah;

/* Created by Rizky Khapidsyah */

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.rizkykhapidsyah.activity.datePicker;
import com.rizkykhapidsyah.activity.datePicker2;
import com.rizkykhapidsyah.activity.galleryView;
import com.rizkykhapidsyah.activity.galleryView2;
import com.rizkykhapidsyah.activity.imageSwitcher;
import com.rizkykhapidsyah.activity.menuLayout;
import com.rizkykhapidsyah.activity.spinnerView;
import com.rizkykhapidsyah.activity.timePicker;
import com.rizkykhapidsyah.activity.timePicker2;

public class MainActivity extends AppCompatActivity {

    Intent Tujuan;
    Button B_1_Java, B_2_Java, B_3_Java, B_4_Java, B_5_Java, B_6_Java, B_7_Java, B_8_Java, B_9_Java;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        B_1_Java = findViewById(R.id.B_1);
        B_2_Java = findViewById(R.id.B_2);
        B_3_Java = findViewById(R.id.B_3);
        B_4_Java = findViewById(R.id.B_4);
        B_5_Java = findViewById(R.id.B_5);
        B_6_Java = findViewById(R.id.B_6);
        B_7_Java = findViewById(R.id.B_7);
        B_8_Java = findViewById(R.id.B_8);
        B_9_Java = findViewById(R.id.B_9);

        B_1_Java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Date Picker Tampil", Toast.LENGTH_SHORT).show();
                Tujuan = new Intent(MainActivity.this, datePicker.class);
                startActivity(Tujuan);
            }
        });

        B_2_Java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Date Picker 2 Tampil", Toast.LENGTH_SHORT).show();
                Tujuan = new Intent(MainActivity.this, datePicker2.class);
                startActivity(Tujuan);
            }
        });

        B_3_Java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Gallery View Tampil", Toast.LENGTH_SHORT).show();
                Tujuan = new Intent(MainActivity.this, galleryView.class);
                startActivity(Tujuan);
            }
        });

        B_4_Java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Gallery View 2 Tampil", Toast.LENGTH_SHORT).show();
                Tujuan = new Intent(MainActivity.this, galleryView2.class);
                startActivity(Tujuan);
            }
        });

        B_5_Java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Image Switcher", Toast.LENGTH_SHORT).show();
                Tujuan = new Intent(MainActivity.this, imageSwitcher.class);
                startActivity(Tujuan);
            }
        });

        B_6_Java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Menu Layout", Toast.LENGTH_SHORT).show();
                Tujuan = new Intent(MainActivity.this, menuLayout.class);
                startActivity(Tujuan);
            }
        });

        B_7_Java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Spinner View", Toast.LENGTH_SHORT).show();
                Tujuan = new Intent(MainActivity.this, spinnerView.class);
                startActivity(Tujuan);
            }
        });

        B_8_Java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Time Picker", Toast.LENGTH_SHORT).show();
                Tujuan = new Intent(MainActivity.this, timePicker.class);
                startActivity(Tujuan);
            }
        });

        B_9_Java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Time Picker 2", Toast.LENGTH_SHORT).show();
                Tujuan = new Intent(MainActivity.this, timePicker2.class);
                startActivity(Tujuan);
            }
        });

    }
}