package com.tebo.aquas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.tebo.bindview.NewIntent;

@NewIntent
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
