package cm1;

import java.util.Scanner;

public class runningDemo25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sorting25 counter = new sorting25();
        mahasiswa25[] arrMhs = new mahasiswa25[3];
        arrMhs[0] = new mahasiswa25("22001", "andi", "Teknik Informatika");
        arrMhs[1] = new mahasiswa25("22002", "Budi", "Teknik Informatika");
        arrMhs[2] = new mahasiswa25("22003", "Citra", "Sistem Informasi Bisnis");

        buku25[] arrBuku = new buku25[4];
        arrBuku[0] = new buku25("B001", "Algoritma", 2020);
        arrBuku[1] = new buku25("B002", "Basis Data", 2019);
        arrBuku[2] = new buku25("B003", "Pemrograman", 2021);
        arrBuku[3] = new buku25("B004", "Fisika", 2024);

        peminjaman25[] arrPinjam = new peminjaman25[5];
        arrPinjam[0] = new peminjaman25(arrBuku[0], arrMhs[0], 7);
        arrPinjam[1] = new peminjaman25(arrBuku[1], arrMhs[1], 3);
        arrPinjam[2] = new peminjaman25(arrBuku[2], arrMhs[2], 10);
        arrPinjam[3] = new peminjaman25(arrBuku[3], arrMhs[2], 6);
        arrPinjam[4] = new peminjaman25(arrBuku[1], arrMhs[0], 4);

        boolean exit = true;
        while (exit == true) {    
            System.out.println("=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Bedasarkan Denda");
            System.out.println("5. Cari Bedasarkan NIM");
            System.out.println("6. Urutkan Bedasarkan Tahun Terbit DEC");
            System.out.println("7. Keluar");
            System.out.print("Pilih: ");
            int index = sc.nextInt();
            switch (index) {
                case 1:
                counter.tampilMhs(arrMhs);
                break;

                case 2:
                counter.tampilBk(arrBuku);
                break;

                case 3:
                counter.tampilPmj(arrPinjam);
                break;

                case 4:
                counter.insertionSort(arrPinjam);
                break;

                case 5:
                    System.out.print("\nMasukan NIM yang dicari: ");
                    int key = sc.nextInt();
                    counter.sortBerdasarkanNim(arrPinjam);
                    int hasil = counter.findKey(arrPinjam, 0, arrPinjam.length - 1 ,key);
                    counter.jrengJreng(key, hasil, arrPinjam);
                    System.out.println("");
                break;

                case 6:
                counter.insertionSortDEC(arrBuku);
                break;
                         
                case 7:
                exit = false;
                break;

                default:
                System.out.println("Menu Tidak valid.");
            }
        }
    }
}
