package com.example.week8.adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.week8.NoteStorage;
import com.example.week8.R;
import com.example.week8.editNote;
import com.example.week8.model.Note;
import com.example.week8.view.ViewHolder;

import java.util.ArrayList;

public class MyRecycleViewAdapter extends RecyclerView.Adapter<ViewHolder> {

    private ArrayList<Note> list;
    public static final String headline = "headline";
    public static final String body = "body";
    public static final String pos = "position";

    public MyRecycleViewAdapter() {
        this.list = NoteStorage.getList();

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LinearLayout ll = (LinearLayout) LayoutInflater.
                from(parent.getContext()).inflate(R.layout.customrow, parent, false);
        return new ViewHolder(ll);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        holder.setData(position); // bind data to one row in the view
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent textToChange = new Intent(v.getContext(), editNote.class);
                textToChange.putExtra(headline, NoteStorage.getNote(position).getHeadline());
                textToChange.putExtra(body, NoteStorage.getNote(position).getBody());
                textToChange.putExtra(pos, position);
                v.getContext().startActivity(textToChange);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
