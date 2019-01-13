package com.example.ravi.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Main3Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ArrayList<Information> infos = new ArrayList<>();
        infos.add(new Information("Java Class", "2018"));
        infos.add(new Information("Android Class", "2019"));

        ListView listView = findViewById(R.id.listView);
        InformationAdapter informationAdapter = new InformationAdapter(this, infos);
        listView.setAdapter(informationAdapter);
    }
}
