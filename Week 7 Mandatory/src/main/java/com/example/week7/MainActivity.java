package com.example.week7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button saveButton;
    private EditText noteText;
    public static final String msg = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        saveButton = findViewById(R.id.saveText);
        saveButton.setOnClickListener(this);

        noteText = findViewById(R.id.editNote);

    }

    @Override
    public void onClick(View v) {

        Intent submit = new Intent(this, Notes.class);
        submit.putExtra(msg, noteText.getText().toString());
        startActivity(submit);

    }
}
