package com.aj.psl05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv1;
    TextView tv2;
    TextView tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = findViewById(R.id.C346);
        tv2 = findViewById(R.id.C349);
        tv3 = findViewById(R.id.C206);

        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this , Response.class);
                intent.putExtra("Answer", 1);
                startActivity(intent);

            }
        });

        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this , Response.class);
                intent.putExtra("Answer", 2);
                startActivity(intent);

            }
        });

        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this , Response.class);
                intent.putExtra("Answer", 3);
                startActivity(intent);

            }
        });

    }
}