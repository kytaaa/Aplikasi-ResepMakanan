package com.anggi.resepmasakanlampung;
public class Resep {
    private String nama;
    private String bahan;
    private String langkah;
    private int gambar;

    public Resep(String nama, String bahan, String langkah, int gambar) {
        this.nama = nama;
        this.bahan = bahan;
        this.langkah = langkah;
        this.gambar = gambar;
    }

    public String getNama() {
        return nama;
    }

    public String getBahan() {
        return bahan;
    }

    public String getLangkah() {
        return langkah;
    }

    public int getGambar() {
        return gambar;
    }
}
