package com.example.asus.appels800;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.asus.appels800.model.Note;

import java.util.ArrayList;
import java.util.List;

 import static com.example.asus.appels800.model.Note.MEDECINETYPE;


public class NoteAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>  implements Filterable {

    private List<Note> notes = new ArrayList<>();
    private List<Note> notesfull ;
    private OnItemClickListener listener;
    private Context cxt;
    String telnum;
    Activity activity;


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view;
        if (viewType == MEDECINETYPE) {

            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.title_item, parent, false);
            return new TitleHolder(view);
        }
        else{

            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.note_item, parent, false);
            return new NoteHolder(view);
        }


    }

    public static class TitleHolder extends RecyclerView.ViewHolder {
        private TextView mTitle;
        public TitleHolder(@NonNull View itemView) {
            super(itemView);
            mTitle = itemView.findViewById(R.id.titleTv);

        }
    }



    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        Note currentNote = notes.get(position);



        if((!currentNote.equals(null))){

            if (currentNote.getPriority()==MEDECINETYPE){
                ((TitleHolder) holder).mTitle.setText(currentNote.getTitle());


            }else{
                ((NoteHolder) holder).textViewTitle.setText(currentNote.getTitle());

                if (currentNote.getNumone() != null ) {
                    ((NoteHolder) holder).numone.setVisibility(View.VISIBLE);
                    ((NoteHolder) holder).imageview1.setVisibility(View.VISIBLE);
                    String str = currentNote.getNumone().replaceAll("\\s+","");
                    ((NoteHolder) holder).numone.setText(str);

                }
                if (currentNote.getNumtwo() != null ) {
                    ((NoteHolder) holder).numtwo.setVisibility(View.VISIBLE);
                    ((NoteHolder) holder).imageview2.setVisibility(View.VISIBLE);
                    String str = currentNote.getNumtwo().replaceAll("\\s+","");
                    ((NoteHolder) holder).numtwo.setText(str);

                }
                if (currentNote.getNumthree() != null ) {
                    ((NoteHolder) holder).numthree.setVisibility(View.VISIBLE);
                    ((NoteHolder) holder).imageview3.setVisibility(View.VISIBLE);
                    String str = currentNote.getNumthree().replaceAll("\\s+","");
                    ((NoteHolder) holder).numthree.setText(str);

                }
                if (currentNote.getNumfour() != null ) {
                    ((NoteHolder) holder).numfour.setVisibility(View.VISIBLE);
                    ((NoteHolder) holder).imageview4.setVisibility(View.VISIBLE);
                    String str = currentNote.getNumfour().replaceAll("\\s+","");
                    ((NoteHolder) holder).numfour.setText(str);

                }
            }



        }





    }

    @Override
    public int getItemCount() {
        return notes.size();
    }




    @Override
    public int getItemViewType(int position) {
        if (notes != null) {
            Note object = notes.get(position);
            if (object != null) {
                return object.getPriority();
            }
        }
        return 0;
    }

    public void setNotes(List<Note> notes, Context cxt, Activity activity) {
        this.notes = notes;
        this.cxt=cxt;
        notifyDataSetChanged();
        this.activity=activity;
        Log.v("debuginconsistneyc", "Adapter : notes"+notes.size());
        notesfull=new ArrayList<>(notes);




    }

    public Note getNoteAt(int position) {
        return notes.get(position);
    }




    class NoteHolder extends RecyclerView.ViewHolder {

        private TextView textViewTitle;
         private TextView numone;
        private TextView numtwo;
        private TextView numthree;
        private TextView numfour;
        private ImageView imageview1,imageview2,imageview3,imageview4;

        public NoteHolder(View itemView) {
            super(itemView);
            textViewTitle = itemView.findViewById(R.id.text_view_title);
            numone = itemView.findViewById(R.id.numone);
             numtwo=itemView.findViewById(R.id.numtwo);
            numthree=itemView.findViewById(R.id.numthree);
            numfour=itemView.findViewById(R.id.numone2);
            imageview1=itemView.findViewById(R.id.phoneiv2);
            imageview2=itemView.findViewById(R.id.phoneiv);
            imageview3=itemView.findViewById(R.id.phoneiv1);
            imageview4=itemView.findViewById(R.id.phoneiv3);


            textViewTitle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                }
            });


            imageview1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                     telnum=numone.getText().toString();
                    Intent intent =new Intent(Intent.ACTION_DIAL,Uri.fromParts("tel", telnum, null));
                     if(ActivityCompat.checkSelfPermission((cxt),Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                        Toast.makeText(cxt, "S'il vous plaît accorder la permission\n", Toast.LENGTH_SHORT).show();
                        requestpermission();

                     }else {

                         activity.startActivity(intent);
                    }

                }

                private void requestpermission() {
                    ActivityCompat.requestPermissions(activity,new String[]{Manifest.permission.CALL_PHONE},1);
                }
            });

            numone.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                   // Toast.makeText(cxt, numone.getText(), Toast.LENGTH_SHORT).show();
                }
            });

            imageview2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                   // Toast.makeText(cxt, numtwo.getText(), Toast.LENGTH_SHORT).show();
                    telnum=numtwo.getText().toString();
                    Intent intent =new Intent(Intent.ACTION_DIAL,Uri.fromParts("tel", telnum, null));
                    if(ActivityCompat.checkSelfPermission((cxt),Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                        Toast.makeText(cxt, "S'il vous plaît accorder la permission\n", Toast.LENGTH_SHORT).show();
                        requestpermission();
                    }else {
                        activity.startActivity(intent);
                    }

                }
                private void requestpermission() {
                    ActivityCompat.requestPermissions(activity,new String[]{Manifest.permission.CALL_PHONE},1);
                }
            });

            numtwo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });

            imageview3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                  //  Toast.makeText(cxt, numthree.getText(), Toast.LENGTH_SHORT).show();
                    telnum=numthree.getText().toString();
                    Intent intent =new Intent(Intent.ACTION_DIAL,Uri.fromParts("tel", telnum, null));
                    if(ActivityCompat.checkSelfPermission((cxt),Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                        Toast.makeText(cxt, "S'il vous plaît accorder la permission\n", Toast.LENGTH_SHORT).show();
                        requestpermission();
                    }else {
                        activity.startActivity(intent);
                    }


                }
                private void requestpermission() {
                    ActivityCompat.requestPermissions(activity,new String[]{Manifest.permission.CALL_PHONE},1);
                }
            });

            numthree.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });

            imageview4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                  //  Toast.makeText(cxt, numfour.getText(), Toast.LENGTH_SHORT).show();
                    telnum=numfour.getText().toString();
                    Intent intent =new Intent(Intent.ACTION_DIAL,Uri.fromParts("tel", telnum, null));
                    if(ActivityCompat.checkSelfPermission((cxt),Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                        Toast.makeText(cxt, "S'il vous plaît accorder la permission\n", Toast.LENGTH_SHORT).show();
                        requestpermission();
                    }else {
                        activity.startActivity(intent);
                    }

                }
                private void requestpermission() {
                    ActivityCompat.requestPermissions(activity,new String[]{Manifest.permission.CALL_PHONE},1);
                }
            });

            numfour.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

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

    @Override
    public Filter getFilter() {
        return noteFilter;
    }


    private Filter noteFilter =new Filter() {

        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            List<Note> filteredList =new ArrayList<>();


            for(int i=0;i<notesfull.size();i++){
                if(notesfull.get(i).getPriority()==99){
                    notesfull.remove(i);
                }
            }

            if (constraint == null || constraint.length() == 0){
                filteredList.addAll(notesfull);


            }else {
                String filterPattern =constraint.toString().toLowerCase().trim();
                for (Note note:notesfull){
                    if(note.getTitle().toLowerCase().contains(filterPattern)){
                        filteredList.add(note);
                    }
                }
            }

            FilterResults results =new FilterResults();
            results.values =filteredList;
            return results;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {

            notes.clear();
            notes.addAll((List)results.values);
            notifyDataSetChanged();
        }
    };


}
