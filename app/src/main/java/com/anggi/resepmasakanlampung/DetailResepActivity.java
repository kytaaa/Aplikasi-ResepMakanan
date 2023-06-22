package com.anggi.resepmasakanlampung;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.ImageView;
import android.os.Bundle;
import android.content.Intent;


public class DetailResepActivity extends AppCompatActivity {
    private TextView tvNama, tvBahan, tvLangkah;
    private ImageView ivGambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_resep);

        tvNama = findViewById(R.id.tvNama);
        tvBahan = findViewById(R.id.tvBahan);
        tvLangkah = findViewById(R.id.tvLangkah);
        ivGambar = findViewById(R.id.ivGambar);

        Intent intent = getIntent();
        if (intent != null) {
            String nama = intent.getStringExtra("nama");
            String bahan = intent.getStringExtra("bahan");
            String langkah = intent.getStringExtra("langkah");
            int gambar = intent.getIntExtra("gambar", 0);

            tvNama.setText(nama);
            tvBahan.setText(bahan);
            tvLangkah.setText(langkah);
            ivGambar.setImageResource(gambar);
        }
    }
}
