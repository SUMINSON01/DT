package com.chobo.practice;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;

public class toSasek extends AppCompatActivity{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_sasek);

        Button front = (Button)findViewById(R.id.chk_front);
        Button foreignToSasek = (Button)findViewById(R.id.chk_foreignTosasek);
        Button lifeToSasek = (Button)findViewById(R.id.chk_lifeToSasek);
        Button sasek = (Button)findViewById(R.id.chk_sasekEnd);
        Intent intent = new Intent(getApplicationContext(),activity_start1.class);

        front.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("stationId",228000723);
                startActivity(intent);
            }
        });
        foreignToSasek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("stationId",228000710);
                startActivity(intent);
            }
        });
        lifeToSasek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("stationId",228000709);
                startActivity(intent);
            }
        });
        sasek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("stationId",228000708);
                startActivity(intent);
            }
        });


    }


}