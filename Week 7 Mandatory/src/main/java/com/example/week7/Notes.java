package com.example.week7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Notes extends AppCompatActivity implements View.OnClickListener {

    private Button backButton;
    private TextView submittedText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes);

        backButton = findViewById(R.id.previousPage);
        backButton.setOnClickListener(this);

        Intent text = getIntent();
        String showText = text.getExtras().getString(MainActivity.msg);

        submittedText = findViewById(R.id.showText);
        submittedText.setText(showText);
    }

    @Override
    public void onClick(View v) {
        finish();
    }
}
