package com.nackademin.foureverhh.appbarlearning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    static final String MESSAGE ="com.nackademin.foureverhh.appbarlearning.message";
    EditText editText;
    Button button;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);

    }

    public void press (View v)
    {
        String message = editText.getText().toString();
        intent = new Intent(this, Main2Activity.class);
        intent.putExtra(MESSAGE,message);
        startActivity(intent);
    }
}
