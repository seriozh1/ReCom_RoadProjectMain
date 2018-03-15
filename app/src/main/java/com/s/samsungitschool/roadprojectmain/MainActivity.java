package com.s.samsungitschool.roadprojectmain;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btOpenMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Запуск активности со входом/регистрацией
        Intent registrationActivityIntent = new Intent(this, RegistrationActivity.class);
        startActivity(registrationActivityIntent);

        // Работа с главной активностью
        btOpenMap = (Button) findViewById(R.id.bt_open_map);

        /*Intent registrationActivityIntent = new Intent(this, RegistrationActivity.class);
        startActivity(registrationActivityIntent);*/
        btOpenMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO Интент не работает
                //Intent intentMapsActivity = new Intent(getBaseContext(), MapsActivity.class);
                //startActivity(intentMapsActivity);

            }
        });

    }
}
