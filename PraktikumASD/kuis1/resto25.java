package PraktikumASD.kuis1;

import java.util.Scanner;

public class resto25 {
    public String namaPembeli;
    public String nmPsn;
    public int jmlPsn;
    public String pembayaran;

    public resto25() {}

    public resto25(String namaPembeli, String nmPsn, int jmlPsn, String pembayaran) {
        this.namaPembeli = namaPembeli;
        this.nmPsn = nmPsn;
        this.jmlPsn = jmlPsn;
        this.pembayaran = pembayaran;
    }

    static void tampilkanPesanan(resto25[] arrayOfResto) {

        System.out.println("\nTabel Daftar Pesananmu:");
        System.out.printf("%-15s %-15s %-10s %-15s\n", "Pembeli", "Pesanan", "Jumlah", "Pembayaran");
        System.out.println("------------------------------------------------------------");

        for (resto25 pesanan : arrayOfResto) {

            if (pesanan != null) {
                System.out.printf("%-15s %-15s %-10d %-15s\n", 
                    pesanan.namaPembeli, pesanan.nmPsn, pesanan.jmlPsn, pesanan.pembayaran);
            }
        }
        System.out.println("------------------------------------------------------------\n");
    }

    static void ubahPesanan(resto25[] arrayOfResto, Scanner sc) {
        System.out.print("Masukkan nama menu yang ingin diubah: ");
        String key = sc.nextLine();
        boolean found = false;

        for (int i = 0; i < arrayOfResto.length; i++) {

            if (arrayOfResto[i].nmPsn.equalsIgnoreCase(key)) {
                System.out.print("Ingin diubah menjadi menu apa: ");
                arrayOfResto[i].nmPsn = sc.nextLine();
                System.out.println("Pesanan diperbarui.");
                found = true;
                break; 
            }

        }

        if (!found) System.out.println("Menu tidak ditemukan.");
    }

    static void ubahJumlah(resto25[] arrayOfResto, Scanner sc) {

        System.out.print("Masukkan nama pembeli untuk ubah jumlah: ");
        String key = sc.nextLine();

        for (resto25 i : arrayOfResto) {

            if (i.namaPembeli.equalsIgnoreCase(key)) {
                System.out.print("Masukkan jumlah baru: ");
                i.jmlPsn = sc.nextInt();
                sc.nextLine();
                return;
            }
        }
    }
}