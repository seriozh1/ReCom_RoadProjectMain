package com.s.samsungitschool.roadprojectmain;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent googleMapIntent = new Intent(this, MapsActivity.class);
        startActivity(googleMapIntent);
    }
}
