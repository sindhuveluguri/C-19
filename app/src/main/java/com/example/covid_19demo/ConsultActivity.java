package com.example.covid_19demo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class ConsultActivity extends AppCompatActivity {

    Button bt_doc;
    ListView lv_doclist;
    ArrayList<String> al;
    ArrayList<Long> numberList;
    ArrayList<String> nameList;
    ArrayAdapter ad;
    private FirebaseDatabase db;
    private DatabaseReference myRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consult);

        bt_doc = findViewById(R.id.bt_doc);
        lv_doclist = findViewById(R.id.lv_doclist);
        db =FirebaseDatabase.getInstance();
        myRef = db.getReference("Doctors");
        al = new ArrayList<String>();
        numberList = new ArrayList<Long>();
        nameList = new ArrayList<String>();

        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                al = new ArrayList<String>();
                for (DataSnapshot i : dataSnapshot.getChildren()) {
                    Doctors doctors = i.getValue(Doctors.class);
                    String data = doctors.getName()+"\n"+doctors.getPhone();
                    Long phone = doctors.getPhone();
                    String name = doctors.getName();
                    al.add(data);
                    numberList.add(phone);
                    nameList.add(name);
                }
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        bt_doc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ad = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,al);
                lv_doclist.setAdapter(ad);
            }
        });


        lv_doclist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                //String num = (String) al.get(i);
                String num = (numberList.get(i)).toString();
                String nam = nameList.get(i);
                Intent it = new Intent(ConsultActivity.this,DoctorActivity.class);
                it.putExtra("key",num);
                it.putExtra("key2",nam);
                startActivity(it);
            }

        });

    }
}