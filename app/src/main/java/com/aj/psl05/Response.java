package com.aj.psl05;

import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Response extends AppCompatActivity {

    TextView tvRes1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_response);

        tvRes1 = findViewById(R.id.textView);

        Intent intentreceived = getIntent();
        int Answer = intentreceived.getIntExtra("Answer", 0);
        if(Answer == 1){
            tvRes1.setText("Module Code: C346\nModule Name: Android Programming\nAcademic Year: 2020\nSemester: 1\nModule Credit: 4\nVenue: W66M");
        }else if(Answer == 2){
            tvRes1.setText("Module Code: C349\nModule Name: iPad Development and Programing\nAcademic Year: 2020\nSemester: 1\nModule Credit: 4\nVenue: E62E");
        }else{
            tvRes1.setText("Module Code: C206\nModule Name: Software Development\nAcademic Year: 2020\nSemester: 1\nModule Credit: 4\nVenue: W65D");
        }
    }
}