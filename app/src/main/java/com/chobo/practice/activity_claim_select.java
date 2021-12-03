package com.chobo.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_claim_select extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_claim_select);

        Button btn_passenger = (Button)findViewById(R.id.btn_passenger);
        Button btn_driver = (Button)findViewById(R.id.btn_driver);

        btn_passenger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),activity_claim_start.class);
                startActivity(intent);
            }
        });
        btn_driver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),activity_claim_start.class);
                startActivity(intent);
            }
        });

    }
}