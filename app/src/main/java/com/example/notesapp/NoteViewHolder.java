package com.example.notesapp;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.constraintlayout.utils.widget.MotionLabel;
import androidx.recyclerview.widget.RecyclerView;

import java.text.CollationElementIterator;

public class NoteViewHolder extends RecyclerView.ViewHolder {
    public View mnote;
    public MotionLabel notetitle;
    public CollationElementIterator notecontent;

    public NoteViewHolder(@NonNull View itemView) {
        super(itemView);
    }
}
