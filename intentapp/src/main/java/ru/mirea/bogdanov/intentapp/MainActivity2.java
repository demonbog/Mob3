package ru.mirea.bogdanov.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle arguments = getIntent().getExtras();
        String name = arguments.get("message").toString();
        TextView textView = new TextView(this);
        textView.setText(name);
        setContentView(textView);
    }
}