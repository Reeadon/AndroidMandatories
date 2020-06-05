package com.example.week8;

import android.util.Log;

import com.example.week8.model.Note;

import java.util.ArrayList;

public class NoteStorage {
    public static ArrayList<Note> list;

    static {
        list = new ArrayList<>();
    }

    public static ArrayList<Note> getList() {
        return list;
    }

    public static int getSize() {
        return list.size();
    }

    public static Note getNote(int index) {
        Log.i("headline", list.get(index).getHeadline());
        return list.get(index);
    }
}

