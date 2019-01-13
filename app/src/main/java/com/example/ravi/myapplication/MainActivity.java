package com.example.ravi.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /*TextView textView = (TextView)findViewById(R.id.text_view);
        textView.setText("Hi world");*/


        Intent intent = new Intent(this,Main3Activity.class);
        startActivity(intent);

       /*Intent intent = new Intent(Intent.ACTION_VIEW);
       intent.setData(Uri.parse("https://www.google.com"));
       startActivity(intent);*/
    }
}
