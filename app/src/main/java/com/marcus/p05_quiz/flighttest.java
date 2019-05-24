package com.marcus.p05_quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

    public class flighttest extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flighttest);

        tv = findViewById(R.id.tv);

        Intent intentReceived = getIntent();
        String flightSelected = intentReceived.getStringExtra("Flight");
        tv.setText("You have selected" + flightSelected + "trip" );
        tv.setText("Your air ticket costs " + "$" + );



    }
}