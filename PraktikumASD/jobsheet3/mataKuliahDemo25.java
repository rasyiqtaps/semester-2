package PraktikumASD.jobsheet3;
import java.util.Scanner;

public class mataKuliahDemo25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Berapa Matakuliah yang ingin ditambahkan: ");
        n = sc.nextInt();
        sc.nextLine();

        mataKuliah25[] arrayOfMataKuliah = new mataKuliah25[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            arrayOfMataKuliah[i] = new mataKuliah25();
            arrayOfMataKuliah[i].tambahData(sc);
            System.out.println("-----------------------------------------");
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayOfMataKuliah[i].cetakInfo();
        }
    }
}