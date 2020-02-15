package com.example.gui_string;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String text = "";
    private EditText editText;
    public static final String messageKey = "MESSAGE_KEY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.editText);
    }

    public void save(View view)
    {
        text = editText.getText().toString();
        Toast.makeText(this, "Saved!", Toast.LENGTH_SHORT).show();
        Log.i("all", "saved: " + text);
        editText.getText().clear();
    }

    public void viewText(View view)
    {
        Intent intent = new Intent(this, ViewText.class);
        intent.putExtra(messageKey, text);
        startActivity(intent);
    }

    public void changeBackground(View view)
    {
        ConstraintLayout layout = findViewById(R.id.forside);
        layout.setBackgroundColor(Color.GREEN);
    }

}
