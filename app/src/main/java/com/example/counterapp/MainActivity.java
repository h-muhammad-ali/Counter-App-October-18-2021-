package com.example.counterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton btnInc;
    FloatingActionButton btnDec;
    TextView txtView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnInc = findViewById(R.id.inc);
        btnDec = findViewById(R.id.dec);
        txtView = findViewById(R.id.counter);
        btnDec.setEnabled(false);
    }

    public void incCounter(View view) {
        String counter = txtView.getText().toString();
        int score = Integer.parseInt(counter);
        score++;
        if (score > 0) {
            btnDec.setEnabled(true);
        }
        txtView.setText(new Integer(score).toString());
    }

    public void decCounter(View view) {
        String counter = txtView.getText().toString();
        int score = Integer.parseInt(counter);
        score--;
        if (score == 0) {
            btnDec.setEnabled(false);
        }
        txtView.setText(new Integer(score).toString());
    }

    public void reset(View view) {
        txtView.setText(new Integer(0).toString());
        btnDec.setEnabled(false);
    }
}