package com.example.week8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.week8.adapter.MyRecycleViewAdapter;
import com.example.week8.model.Note;

public class editNote extends AppCompatActivity implements View.OnClickListener {

    private EditText editHeadline, editBody;
    private Button button;
    private Bundle bundle;
    private Boolean editing = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_note);

        editHeadline = findViewById(R.id.headline);
        editBody = findViewById(R.id.body);
        button = findViewById(R.id.savechanges);
        button.setOnClickListener(this);
        bundle = getIntent().getExtras();
        if (bundle != null) {
            editHeadline.setText(bundle.getString(MyRecycleViewAdapter.headline));
            editBody.setText(bundle.getString(MyRecycleViewAdapter.body));
            editing = true;
        }


    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case (R.id.savechanges):
                if (!editing) {
                    NoteStorage.getList().add(new Note(editHeadline.getText().toString(), editBody.getText().toString()));
                    finish();
                } else {
                    NoteStorage.getList().set(bundle.getInt(MyRecycleViewAdapter.pos), new Note(editHeadline.getText().toString(), editBody.getText().toString()));
                    finish();
                }

        }
    }
}
