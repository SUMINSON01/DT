package com.chobo.practice;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        Button btn_start = (Button)findViewById(R.id.btn_start);
        btn_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox chkfirst = (CheckBox)findViewById(R.id.chk_first);
                CheckBox chksecond = (CheckBox)findViewById(R.id.chk_second);
                Intent intentfirst = new Intent(getApplicationContext(),toFrontDoor.class);
                Intent intentsecond = new Intent(getApplicationContext(),toSasek.class);
                AlertDialog.Builder ad = new AlertDialog.Builder(MainActivity.this);

                ad.setIcon(R.drawable.khu);
                ad.setTitle("경고");
                ad.setMessage("방향을 선택해주세요");



                if(chkfirst.isChecked()){
                    startActivity(intentfirst);
                }
                else if(chksecond.isChecked()){
                    startActivity(intentsecond);
                }
                else{
                    ad.setPositiveButton("닫기", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
                    ad.show();

                }



            }
        });



    }
}