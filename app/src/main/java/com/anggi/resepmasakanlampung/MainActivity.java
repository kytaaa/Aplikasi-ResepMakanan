package com.anggi.resepmasakanlampung;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;



public class MainActivity extends AppCompatActivity {
    private RecyclerView rvResep;
    private ArrayList<Resep> listResep;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvResep = findViewById(R.id.rvResep);
        rvResep.setHasFixedSize(true);

        listResep = new ArrayList<>();
        listResep.add(new Resep("Gulay Taboh", "- Bahan resep Gulay Taboh\n- 500 gram ikan tuna\n- 3 butir kemiri (haluskan)\n- 5 buah belimbing wuluh (iris)\n- 8 siung bawang merah (haluskan)\n- 4 siung bawang putih (haluskan)\n- 10 buah cabai rawit (sesuai selera)\n- garam secukupnya\n- kunyit secukupnya (haluskan)\n- 1 batang serai (geprek)\n- 200 ml santan kental\n- lengkuas secukupnya (geprek)\n- kemangi secukupnya (siangi)\n- jeruk nipis/lemon\n- gula secukupnya\n- penyedap (opsional)", "Langkah-langkah resep Gulai Taboh\n- 1.Cuci bersih ikan tuna, lumuri air perasan jeruk nipis/lemon dan biarkan selama 5 menit\n2.Tumis bawang merah, bawang putih, cabai, kunyit, kemiri, dan garam. Masukkan serai dan laos, tumi hingga matang\n3. Tuang air, masukkan ikan, beri gula dan penyedap. Masak selama 5 menit. Tuang santan bersama belimbing wuluh. Tunggu hingga mendidih, aduk perlahan agar santan tidak pecah. Terakhir masukan daun kemangi.", R.drawable.gambar1));
        listResep.add(new Resep("Seruit", "- Bahan resep Seruit\n- 5 butir cabe merah\n- 3 siung bawang merah\n- 2 block terasi\n- 2 buah jeruk sate\n- 200 gram rampai\n-  peyedap ", "Langkah-langkah resep Seruit\n1.Bersihkan ikan, sisihkan\n2.Haluskan cabai merah, bawang merah, dan garam. Campurkan dengan ikan. Tuang minyak, aduk rata. Diamkan selama 15 menit. Panggang ikan sampai matang\n- 3.Untuk sambal, campur semua bahan sambal, masukkan tomat kecil dan digiling sampai halus. Iris jeruk sate, peras airnya masukkan ke dalam sambal. ", R.drawable.gambar2));
        listResep.add(new Resep("Tempoyak Udang", "- Bahan resep Tempoyak Udang\n- 300 gram daging durian (sudah didiamkan selama 3-4 hari)\n- 250 gram Udang (bersihkan,buang kepala)\n- 2 siung bawang putih \n-  2 lembar daun salam\n- 200 gram kelapa muda parut (ulek setengah halus)\n- 50 gram cabai merah\n- 3 siung bawang merah\n- 1 batang serai\n- 1 ruas jari lengkuas\n- gula putih dan penyedap rasa secukupnya", "Langkah-langkah resep Tempoyak Udang\n- 1. Haluskan sebua bumbu terdiri dari kunyit, lengkuas, cabai merah,cabai rawit, bawang merah, dan bawang putih. Untuk serai cukup dimemarkan\n- 2. Tuang santan kental, masukkan daun salam. Aduk hingga mendidih\n- 3. Masukan tempoyak (daging durian), kelapa parut, udang, dan petai. Sesekali diaduk\n- 4. Beri gula dan penyedap rasa sesuai selera. Tunggu hingga sambal mengering.", R.drawable.gambar3));
        listResep.add(new Resep("Segubal", "- Bahan resep Segubal\n- Garam secukupnya\n- 1 kg ketan3 \n- Santan dari 1 butir kelapa\n- Daun pisang ", "Langkah-langkah resep Segubal\n 1.Ambil ketan dan kukus, kemudian Ketan yang sudah dikukus di letakkan dalam wadah,\n2.Sirami santan dan beri sedikit garam.\n3.Kukus lagi hingga matang.\n4.Cetak dengan cetakan yang berukuran 16 cm tebal 1 cm.\n5.Bungkus dengan daun pisang dan lalu susun berlapis-lapis, dan ikat dengan tali.\n6.Rebus kurang lebih selama 2 jam. Angkat dan siap disajikan\n", R.drawable.gambar4));

        // Tambahkan resep lainnya...

        ResepAdapter adapter = new ResepAdapter(listResep, this);
        rvResep.setAdapter(adapter);
        rvResep.setLayoutManager(new LinearLayoutManager(this));
    }
}
