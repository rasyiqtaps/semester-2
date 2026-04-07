package PraktikumASD.jobsheet5;

public class mahasiswa25 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    mahasiswa25(){

    }

    mahasiswa25(String nm, String name, String kls, double ip) {
        nim =nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }

    void tampilInformasi() {
        System.out.println("nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Kelas: " + kelas);
        System.out.println("IPK: " + ipk);
    }
}
