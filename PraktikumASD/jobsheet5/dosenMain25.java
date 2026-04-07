package PraktikumASD.jobsheet5;

import java.util.Scanner;

public class dosenMain25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        dataDosen25 listDsn = new dataDosen25(); 
        int menu;

        do {
            System.out.println("\n=== MENU MANAJEMEN DATA DOSEN ===");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampil Data Seluruh Dosen");
            System.out.println("3. Sorting ASC (Usia Termuda ke Tertua)");
            System.out.println("4. Sorting DSC (Usia Tertua ke Termuda)");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.println("\n--- Tambah Data Dosen ---");
                    System.out.print("Masukkan Kode Dosen   : ");
                    String kode = sc.nextLine();
                    System.out.print("Masukkan Nama Dosen   : ");
                    String nama = sc.nextLine();
                    System.out.print("Jenis Kelamin (L/P)   : ");
                    String jkInput = sc.nextLine();
                    boolean jk = jkInput.equalsIgnoreCase("L"); 
                    System.out.print("Masukkan Usia Dosen   : ");
                    int usia = sc.nextInt();
                    
                    // Memanggil konstruktor dosen25 (huruf kecil)
                    dosen25 dsnBaru = new dosen25(kode, nama, jk, usia);
                    listDsn.tambah(dsnBaru);
                    System.out.println("Data berhasil ditambahkan!");
                    break;
                    
                case 2:
                    listDsn.tampil();
                    break;
                    
                case 3:
                    listDsn.SortingASC();
                    System.out.println("\n[Sukses] Diurutkan ASC (Termuda).");
                    break;
                    
                case 4:
                    listDsn.sortingDSC();
                    System.out.println("\n[Sukses] Diurutkan DSC (Tertua).");
                    break;
                    
                case 0:
                    System.out.println("Keluar program...");
                    break;
            }
        } while (menu != 0);
        sc.close();
    }
}