package com.example.android_app_lab_1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    private Button btn1,btn2,btn3;
    private LinearLayout lo1,lo2,lo3;

    int i1 = 0;
    int i2 = 0;
    int i3 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.button_1);
        btn2 = findViewById(R.id.button_2);
        btn3 = findViewById(R.id.button_3);

        lo1 = findViewById(R.id.l1);
        lo2 = findViewById(R.id.l2);
        lo3 = findViewById(R.id.l3);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(3<i1){
                    i1=0;
                }else if(i1==1){
                    lo1.setBackgroundColor(Color.argb(255, 255, 255, 0));
                }else if(i1==2){
                    lo1.setBackgroundColor(Color.argb(255, 255, 0, 0));
                }else if(i1==3){
                    lo1.setBackgroundColor(Color.argb(255, 0, 0, 255));
                }
                i1 ++;
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(3<i2){
                    i2 = 0;
                }else if(i2==1){
                    lo2.setBackgroundColor(Color.argb(255, 255, 255, 0));
                }else if(i2==2){
                    lo2.setBackgroundColor(Color.argb(255, 255, 0, 0));
                }else if(i2==3){
                    lo2.setBackgroundColor(Color.argb(255, 0, 0, 255));
                }
                i2 ++;
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(3<i3){
                    i3=0;
                }else if(i3==1){
                    lo3.setBackgroundColor(Color.argb(255, 255, 255, 0));
                }else if(i3==2){
                    lo3.setBackgroundColor(Color.argb(255, 255, 0, 0));
                }else if(i3==3){
                    lo3.setBackgroundColor(Color.argb(255, 0, 0, 255));
                }
                i3 ++;
            }
        });
    }
}