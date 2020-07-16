package com.example.covid_19demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class WorldActivity extends AppCompatActivity {
  Button btn_world;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_world);

        btn_world = findViewById(R.id.btn_world);

        btn_world.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(WorldActivity.this,Tip1Activity.class));
            }
        });
    }
}