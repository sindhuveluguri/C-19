package com.example.covid_19demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tip4Activity extends AppCompatActivity {

    Button btn_tip4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip4);

        btn_tip4 = findViewById(R.id.btn_tip4);
        btn_tip4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Tip4Activity.this,PatientDetailsActivity.class));
            }
        });
    }
}