package com.example.covid_19demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tip3Activity extends AppCompatActivity {

    Button btn_tip3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip3);
        btn_tip3 = findViewById(R.id.btn_tip3);
        btn_tip3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Tip3Activity.this,Tip4Activity.class));
            }
        });

    }
}