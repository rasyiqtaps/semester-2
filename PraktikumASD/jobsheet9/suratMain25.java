package praktikumASD.jobsheet9;

import java.util.Scanner;

public class suratMain25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        stackSurat25 tumpukanSurat = new stackSurat25(10); 
        int pilihan;

        do {
            System.out.println("\n=== Sistem Pengelolaan Surat Izin Admin Prodi ===");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan ID Surat: ");
                    String id = sc.nextLine();
                    sc.nextLine();
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin (S: Sakit, I: Izin lain): ");
                    char jenis = sc.nextLine().charAt(0);
                    System.out.print("Masukkan Durasi (hari): ");
                    int durasi = sc.nextInt();
                    sc.nextLine();

                    surat25 suratBaru = new surat25(id, nama, kelas, jenis, durasi);
                    tumpukanSurat.push(suratBaru);
                    break;
                case 2:
                    tumpukanSurat.pop();
                    break;
                case 3:
                    tumpukanSurat.peek();
                    break;
                case 4:
                    System.out.print("Masukkan Nama Mahasiswa yang dicari: ");
                    String cariNama = sc.nextLine();
                    sc.nextLine();
                    tumpukanSurat.cariSurat(cariNama);
                    break;
                case 5:
                    System.out.println("Keluar dari program. Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih 1-5.");
            }
        } while (pilihan != 5);
    }
}