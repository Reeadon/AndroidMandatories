package com.example.week6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class contact extends AppCompatActivity implements View.OnClickListener {

    private Button button5, button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        button5 = findViewById(R.id.button5);
        button5.setOnClickListener(this);

        button6 = findViewById(R.id.button6);
        button6.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case (R.id.button5):
                Intent frontpage = new Intent(this, MainActivity.class);
                startActivity(frontpage);
                break;

            case(R.id.button6):
                Intent about = new Intent(this, about.class);
                startActivity(about);
                break;
        }
    }
}
