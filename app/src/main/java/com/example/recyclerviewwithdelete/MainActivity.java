package com.example.recyclerviewwithdelete;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerView);

        List<Contact> contactList=new ArrayList<>();
        contactList.add(new Contact("Lizan","21","Male","Patan",null));
        contactList.add(new Contact("Lizan","21","Male","Patan",null));
        contactList.add(new Contact("Lizan","21","Male","Patan",null));
        contactList.add(new Contact("Sita","20","Female","Patan",null));

        ContactAdapter contactAdapter=new ContactAdapter(this,contactList);
        recyclerView.setAdapter(contactAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
