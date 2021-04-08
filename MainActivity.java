package com.example.daypicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    EditText months;
    EditText days;
    EditText years;
    Button get_day;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        months=(EditText) findViewById(R.id.editTextTextPersonName3);
        days=(EditText) findViewById(R.id.editTextTextPersonName4);
        years=(EditText) findViewById(R.id.editTextTextPersonName6);
        get_day=(Button) findViewById(R.id.button);
        result=(TextView) findViewById((R.id.textView4));

        get_day.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String month = months.getText().toString();
                String day =days.getText().toString();
                String year =years.getText().toString();

                Calendar c = Calendar.getInstance();
                c.set(Integer.parseInt(year), Integer.parseInt(month)-1,Integer.parseInt(day));
                String dayOfWeek = getDayOfWeek(c.get(Calendar.DAY_OF_WEEK));
                result.setText(dayOfWeek.toUpperCase() );
            }

            private String getDayOfWeek(int value){
                String day = "";
                switch(value){
                    case 1:
                        day="Sunday";
                        break;
                    case 2:
                        day="Monday";
                        break;
                    case 3:
                        day="Tuesday";
                        break;
                    case 4:
                        day="Wednesday";
                        break;
                    case 5:
                        day="Thursday";
                        break;
                    case 6:
                        day="Friday";
                        break;
                    case 7:
                        day="Saturday";
                        break;
                }
                return day;

            }
        });
    }
}