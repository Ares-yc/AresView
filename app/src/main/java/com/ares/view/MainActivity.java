package com.ares.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.ares.view.textview.AresTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AresTextView aresTextView = new AresTextView(this);
    }
}
