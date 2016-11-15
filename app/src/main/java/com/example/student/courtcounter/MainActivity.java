package com.example.student.courtcounter;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity{
    private TextView points;
    private TextView goals;

    private AlertDialog gameOverAlert;

    private double a = 0;
    private double b = 0;


    public void pointButton1(View view) {
        a++;
        points.setText(String.valueOf(a));
    }

    public void pointButton2(View view) {
        b++;
        goals.setText(String.valueOf(b));
    }

    public void pointButton3(View view) {
        a--;
        points.setText(String.valueOf(a));
    }

    public void pointButton4(View view) {
        b--;
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

            gameOverAlert= new AlertDialog.Builder(MainActivity.this).create();
            gameOverAlert.setTitle("Game Over");

            gameOverAlert.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
        }

    public void gameOverAlert(View view) {
        if (a > b) {
            gameOverAlert.setMessage("Team Apple wins");
        }else if(a < b) {
            gameOverAlert.setMessage("Team Android wins");
        }else if(a == b) {
            gameOverAlert.setMessage("Teams Tie");
        }

        a = 0;
        b = 0;

        points.setText(String.valueOf(a));
        goals.setText(String.valueOf(b));

        gameOverAlert.show();
    }
}