package com.nackademin.foureverhh.appbarlearning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView textView;
    Intent intent;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        intent = getIntent();
        String messageFromMain1 = intent.getStringExtra(MainActivity.MESSAGE);

        textView = findViewById(R.id.textView);
        textView.setText(messageFromMain1);

        toolbar = findViewById(R.id.my_toolbar2);
        setSupportActionBar(toolbar);
    }
}
