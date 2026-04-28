package PraktikumASD.kuis1;

import java.util.Scanner;

public class restoDemo25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, pembayaran, nmPsn;
        int jumlah, jmlPsn;

        System.out.println("=== Selamat datang di restoran ===");
        
        System.out.print("Masukan Nama\t: ");
        nama = sc.nextLine();
        
        System.out.print("Berapa jenis menu yang ingin dipesan? : ");
        jumlah = sc.nextInt();
        sc.nextLine();

        System.out.print("Metode Pembayaran: ");
        pembayaran = sc.nextLine();
        //sc.nextLine();

        resto25[] arrayOfResto = new resto25[jumlah];

        for (int i = 0; i < arrayOfResto.length; i++) {

            System.out.println("\n---Menu ke-" + (i + 1) + " dari " + jumlah + " ---");
            System.out.print("Nama Menu\t: ");
            nmPsn = sc.nextLine();
            
            System.out.print("Jumlah Porsi\t: ");
            jmlPsn = sc.nextInt();
            sc.nextLine();
            
            arrayOfResto[i] = new resto25(nama, nmPsn, jmlPsn, pembayaran);
        }

        boolean berjalan = true;
        while (berjalan) {

            System.out.println("\n======= Konfirmasi Pesanan =======");
            System.out.println("1. Tampilkan semua pesanan");
            System.out.println("2. Ubah nama menu");
            System.out.println("3. Ubah jumlah porsi");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            
            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    resto25.tampilkanPesanan(arrayOfResto);
                    break;
                case 2:
                    resto25.ubahPesanan(arrayOfResto, sc);
                    break;
                case 3:
                    resto25.ubahJumlah(arrayOfResto, sc); 
                    break;
                case 0:
                    System.out.println("Program dihentikan. Terima Kasih!");
                    berjalan = false;
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia.");
            }
        }

        sc.close();
    }
}