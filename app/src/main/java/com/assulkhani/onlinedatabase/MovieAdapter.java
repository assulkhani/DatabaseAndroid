package com.assulkhani.onlinedatabase;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MyViewholder> {
    private Context context;
    private List<MovieModel> data = new ArrayList<>();

    // selanjutnya membuat constructor
    // dengan cata klik kanan kemudian memilih constructor

    public MovieAdapter(Context context, List<MovieModel> data) {
        this.context = context;
        this.data = data;
    }

    // menyambungkan layout item
    @NonNull
    @Override
    public MyViewholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.item_movie,viewGroup, false);
        return new MyViewholder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewholder myViewholder, int i) {
        myViewholder.tvJudul.setText(data.get(i).getJudulFilm());
        Glide.with(context).load(data.get(i).getPosterFilm()).into(myViewholder.ivPoster);

    }

    @Override
    public int getItemCount() {

        return data.size();
    }

    // menyambungkan layout item
    public class MyViewholder extends RecyclerView.ViewHolder {
        TextView tvJudul;
        ImageView ivPoster;
        public MyViewholder(@NonNull View itemView) {
            super(itemView);
            tvJudul = itemView.findViewById(R.id.tv_item_judul);
            ivPoster = itemView.findViewById(R.id.iv_item_images);
        }
    }
    // langkah selanjutnya membuat eksten

}
