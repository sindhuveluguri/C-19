package com.example.covid_19demo;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import static android.Manifest.permission.CALL_PHONE;

public class DoctorActivity extends AppCompatActivity {

    TextView number,name;
    Button call;
    char a[];
    int i,j;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor);
        name = findViewById(R.id.name);
        number = findViewById(R.id.number);
        call = findViewById(R.id.bt_call);
        Intent it = getIntent();
        String s1 = it.getStringExtra("key");
        String s2 = it.getStringExtra("key2");
        number.setText(s1);
        name.setText(s2);

        call.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {

                String no = number.getText().toString();
                String dial = "tel:" + no;
                Intent i = new Intent(Intent.ACTION_CALL);
                i.setData(Uri.parse(dial));
                if (ContextCompat.checkSelfPermission(getApplicationContext(), CALL_PHONE) == PackageManager.PERMISSION_GRANTED) {
                    startActivity(i);
                }
                else {
                    requestPermissions(new String[]{CALL_PHONE}, 1);
                }
            }
        });

    }
}