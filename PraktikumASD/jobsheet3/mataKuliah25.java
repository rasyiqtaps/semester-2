package PraktikumASD.jobsheet3;
import java.util.Scanner;

public class mataKuliah25 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public mataKuliah25() {
    }

    public mataKuliah25(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public void tambahData(Scanner sc) {
        System.out.print("Kode\t: ");
            this.kode = sc.nextLine();
        System.out.print("Nama\t: ");
            this.nama = sc.nextLine();
        System.out.print("SKS\t: ");
            this.sks = Integer.parseInt(sc.nextLine());
        System.out.print("Jumlah Jam\t: ");
            this.jumlahJam = Integer.parseInt(sc.nextLine());
    }

    public void cetakInfo() {
            System.out.println("Kode\t: " + this.kode);
            System.out.println("Nama\t: " + this.nama);
            System.out.println("SKS\t: " + this.sks);
            System.out.println("Jumlah Jam\t: " + this.jumlahJam);
            System.out.println("-----------------------------------------");
    }
}