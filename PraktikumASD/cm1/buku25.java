package cm1;

public class buku25 {
    String kodeBuku;
    String judul;
    int tahunTerbit;

    public buku25(){
    }
    public buku25(String code, String judul, int thnTrbt){
        kodeBuku = code;
        this.judul = judul;
        tahunTerbit = thnTrbt;
    }

    void tampilBuku25() {
        System.out.print("Kode Buku : " + kodeBuku + " | ");
        System.out.print("Judul Buku : " + judul + " | ");
        System.out.println("Tahun Terbit : " + tahunTerbit);
    }
}