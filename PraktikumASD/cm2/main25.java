package cm2;

import java.util.Scanner;
public class main25 {
    public static void main(String[] args) {
        antrianQueue25 antrian = new antrianQueue25();
        daftarPesanan25 laporan = new daftarPesanan25();
        Scanner sc = new Scanner(System.in);
        
        int autoNoAntrian = 1;

        antrian.tambahAntrian(autoNoAntrian++, "Ainra", "08224500000");
        antrian.tambahAntrian(autoNoAntrian++, "Danra", "08224511111");
        antrian.tambahAntrian(autoNoAntrian++, "Sanri", "08224522222");

        int pilihan;
        do {
            System.out.println("\n=================================");
            System.out.println("SISTEM ANTRIAN ROYAL DELISH");
            System.out.println("=================================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Nama Pembeli : ");
                    String nama = sc.nextLine();
                    System.out.print("No HP        : ");
                    String hp = sc.nextLine();
                    antrian.tambahAntrian(autoNoAntrian++, nama, hp);
                    break;

                case 2:
                    antrian.cetakAntrian();
                    break;

                case 3:
                    nodePembeli25 dipanggil = antrian.hapusAntrian();
                    if (dipanggil != null) {
                        System.out.println("-----------------------------------------");
                        System.out.println("Memproses antrean nomor: " + dipanggil.noAntrian + " atas nama " + dipanggil.data.namaPembeli);
                        System.out.print("Kode Pesanan : ");
                        int kode = sc.nextInt();
                        sc.nextLine(); 
                        System.out.print("Nama Pesanan : ");
                        String namaMenu = sc.nextLine();
                        System.out.print("Harga        : ");
                        int harga = sc.nextInt();
                        
                        laporan.tambahPesanan(kode, namaMenu, harga);
                        System.out.println(dipanggil.data.namaPembeli + " telah memesan " + namaMenu);
                    } else {
                        System.out.println("Tidak ada antrian yang bisa diproses!");
                    }
                    break;

                case 4:
                    laporan.cetakLaporan();
                    break;

                case 0:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
        
        sc.close();
    }
}