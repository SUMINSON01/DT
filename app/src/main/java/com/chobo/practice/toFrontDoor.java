package com.chobo.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class toFrontDoor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_front_door);

        Button sasek = (Button)findViewById(R.id.chk_sasek);
        Button lifeToFront = (Button)findViewById(R.id.chk_lifeToFront);
        Button peToFront = (Button)findViewById(R.id.chk_peToFront);
        Button front = (Button)findViewById(R.id.chk_frontEnd);
        Intent intent = new Intent(getApplicationContext(),activity_start1.class);

        sasek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("stationId",228001174);
                startActivity(intent);
            }
        });
        lifeToFront.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("stationId",228000704);
                startActivity(intent);
            }
        });
        peToFront.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("stationId",228000703);
                startActivity(intent);
            }
        });
        front.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("stationId",203000125);
                startActivity(intent);
            }
        });


    }
}