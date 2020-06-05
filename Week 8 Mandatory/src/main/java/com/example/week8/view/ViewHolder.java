package com.example.week8.view;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.week8.NoteStorage;
import com.example.week8.R;

public class ViewHolder extends RecyclerView.ViewHolder {

    public TextView textView;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        LinearLayout linearLayout = (LinearLayout)itemView;
        textView = linearLayout.findViewById(R.id.textView1);
    }

    public void setData(int position) {
        textView.setText(NoteStorage.getNote(position).getHeadline());
    }


}
