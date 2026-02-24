package PraktikumASD.jobsheet3;

public class dosen25 {
    public String kode;
    public String nama;
    public Boolean jenisKelamin;
    public int usia;

    public dosen25() {
    }
    
    public dosen25(String kode, String nama, Boolean jK, int usia) {
        this.kode = kode;
        this.nama = nama;
        jenisKelamin = jK;
        this.usia = usia;
    }

    public String getStrJenisKelamin() {
        if (this.jenisKelamin) {
            return "Pria";
        } else {
            return "Wanita";
        }
    }

    public void cetakInfo() {
        System.out.println("kode\t: " + kode);
        System.out.println("Nama\t: " + nama);
        System.out.println("Gender  : " + (jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Jumlah Jam\t: " + usia);
        System.out.println("-----------------------------------------");
    }
}
