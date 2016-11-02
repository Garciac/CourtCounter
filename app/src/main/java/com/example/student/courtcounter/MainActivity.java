package com.example.student.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity{
    private TextView points;
    public TextView viewVar;
    double a;



    public void pointButton(View view) {
        points.setText("0");
        viewVar.setText( String.valueOf(a) );
        viewVar.setText(""+a);
    }

        @Override
        protected void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            points = (TextView) findViewById(R.id.textViewName);

        }
}