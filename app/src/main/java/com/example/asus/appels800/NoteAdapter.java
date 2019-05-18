package com.example.asus.appels800;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.asus.appels800.model.Note;

import java.util.ArrayList;
import java.util.List;



public class NoteAdapter extends RecyclerView.Adapter<NoteAdapter.NoteHolder> {

    private List<Note> notes = new ArrayList<>();
    private OnItemClickListener listener;


    @Override
    public NoteHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.note_item, parent, false);
        return new NoteHolder(itemView);
    }

    @Override
    public void onBindViewHolder(NoteHolder holder, int position) {

        Note currentNote = notes.get(position);
        holder.textViewTitle.setText(currentNote.getTitle());
        holder.numone.setText(currentNote.getNumone());

        if((!currentNote.equals(null))){
            holder.numtwo.setText(String.valueOf(currentNote.getNumtwo()));
        }
        if((!currentNote.equals(null))){
            holder.numthree.setText(String.valueOf(currentNote.getNumthree()));
        }


    }

    @Override
    public int getItemCount() {
        return notes.size();
    }


    public void setNotes(List<Note> notes) {
        this.notes = notes;
        notifyDataSetChanged();

    }

    public Note getNoteAt(int position) {
        return notes.get(position);
    }


    class NoteHolder extends RecyclerView.ViewHolder {

        private TextView textViewTitle;
         private TextView numone;
        private TextView numtwo;
        private TextView numthree;

        public NoteHolder(View itemView) {
            super(itemView);
            textViewTitle = itemView.findViewById(R.id.text_view_title);
            numone = itemView.findViewById(R.id.numone);
             numtwo=itemView.findViewById(R.id.numtwo);
            numthree=itemView.findViewById(R.id.numthree);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition();
                    if (listener != null && position != RecyclerView.NO_POSITION) {
                        listener.onItemClick(notes.get(position));

                    }

                }
            });
        }
    }


    public interface OnItemClickListener {
        void onItemClick(Note note);
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        this.listener = listener;


    }

}
