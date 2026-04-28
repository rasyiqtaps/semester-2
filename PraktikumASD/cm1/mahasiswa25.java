package cm1;

public class mahasiswa25 {
    String nim;
    String nama;
    String prodi;

    public mahasiswa25() {
    }
    public mahasiswa25(String NIM, String nama, String prodi) {
        this.nim = NIM;
        this.nama = nama;
        this.prodi = prodi;
    }

    void tampilInformasiMhs25() {
        System.out.print("NIM : " + nim + " | ");
        System.out.print("Nama : " + nama + " | ");
        System.out.println("Prodi : " + prodi);
    }
}
