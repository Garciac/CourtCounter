package com.example.student.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity{
    private TextView points;
    private TextView goals;


    private double a = 0;
    private double b = 0;




    public void pointButton(View view) {
        a++;
        points.setText(String.valueOf(a));
    }

    public void pointButton2(View view) {
        b++;
        goals.setText(String.valueOf(b));
    }

        @Override
        protected void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            points = (TextView) findViewById(R.id.points);
            points.setText(String.valueOf(a));

            goals = (TextView) findViewById(R.id.goals);
            goals.setText(String.valueOf(b));

        }
}