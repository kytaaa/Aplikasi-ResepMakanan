package com.anggi.resepmasakanlampung;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ResepAdapter extends RecyclerView.Adapter<ResepAdapter.ResepViewHolder> {
    private ArrayList<Resep> listResep;
    private Context context;

    public ResepAdapter(ArrayList<Resep> listResep, Context context) {
        this.listResep = listResep;
        this.context = context;
    }

    @NonNull
    @Override
    public ResepViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_resep, parent, false);
        return new ResepViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ResepViewHolder holder, int position) {
        final Resep resep = listResep.get(position);
        holder.tvNamaResep.setText(resep.getNama());
        holder.ivGambarResep.setImageResource(resep.getGambar());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DetailResepActivity.class);
                intent.putExtra("nama", resep.getNama());
                intent.putExtra("bahan", resep.getBahan());
                intent.putExtra("langkah", resep.getLangkah());
                intent.putExtra("gambar", resep.getGambar());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listResep.size();
    }

    public class ResepViewHolder extends RecyclerView.ViewHolder {
        private TextView tvNamaResep;
        private ImageView ivGambarResep;

        public ResepViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNamaResep = itemView.findViewById(R.id.tvNamaResep);
            ivGambarResep = itemView.findViewById(R.id.ivGambarResep);
        }
    }
}
