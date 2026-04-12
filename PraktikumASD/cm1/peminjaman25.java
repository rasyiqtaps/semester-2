package PraktikumASD.cm1;

public class peminjaman25 {
    mahasiswa25 mhs;
    buku25 bku;
    int lamaPinjam;
    int batasPinjam = 5;
    int terlambat;
    int denda;

    public peminjaman25() {
    }
    public peminjaman25(buku25 bku, mahasiswa25 mhs, int durasi) {
        this.mhs = mhs;
        this.bku = bku;
        lamaPinjam = durasi;
    }

    void tampilPeminjaman25() {
        hitungDenda25();
        System.out.print(mhs.nama + " | ");
        System.out.print(bku.judul + " | ");
        System.out.print("Lama : " + lamaPinjam + " | ");
        System.out.print("Terlambat : " + terlambat + " | ");
        System.out.println("Denda : " + denda);
    }

    void hitungDenda25() {
        for (int i = 0; i < 5; i++) {
            if (lamaPinjam > batasPinjam) {
                terlambat = lamaPinjam - batasPinjam;
                denda = 2000 * terlambat;
            } else {
                terlambat = 0;
                denda = 0;
            }
        }
    }
}
