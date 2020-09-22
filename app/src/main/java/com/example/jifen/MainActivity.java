package com.example.jifen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void left(View view) {
        TextView tv= findViewById(R.id.textView8);
        tv.setText(String.valueOf(Integer.parseInt(tv.getText().toString())+Integer.parseInt(view.getTag().toString())));
    }

    public void right(View view) {
        TextView tv=findViewById(R.id.textViewn8);
        tv.setText(String.valueOf(Integer.parseInt(tv.getText().toString())+Integer.parseInt(view.getTag().toString())));
    }

    public void reset(View view) {
        TextView tv=findViewById(R.id.textViewn8);
        tv.setText("0");
        tv=findViewById(R.id.textView8);
        tv.setText("0");
    }
}