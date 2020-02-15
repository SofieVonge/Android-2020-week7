package com.example.gui_string;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ViewText extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        TextView textView = (TextView) findViewById(R.id.textView2);
        Intent intent = getIntent();
        String text = intent.getStringExtra(MainActivity.messageKey);
        textView.setText(text);

    }
}
