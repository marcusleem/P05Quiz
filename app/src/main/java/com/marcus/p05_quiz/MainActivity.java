package com.marcus.p05_quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox oneWay;
    CheckBox roundWay;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    oneWay =findViewById(R.id.oneWay);
    roundWay =findViewById(R.id.roundTrip);
    btnSubmit = findViewById(R.id.btnSubmit);

    oneWay.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent=new Intent(getBaseContext(),flighttest.class);
            startActivity(intent);
            }
        });

        roundWay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getBaseContext(),flighttest.class);
                startActivity(intent);
            }
        });

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(oneWay.isChecked()) {
                    100*pax;
                }
                else if(roundWay.isChecked()){
                    100*pax*2;
                }
                else{
                    Toast.makeText(MainActivity.this, "Invalid ticket type", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}
