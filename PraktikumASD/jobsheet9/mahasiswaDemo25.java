package praktikumASD.jobsheet9;

import java.util.Scanner;

public class mahasiswaDemo25 {
    public static void main(String[] args) {
        stackTugasMahasiswa25 stack = new stackTugasMahasiswa25(5);
        Scanner sc = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat daftar Tugas");
            System.out.println("5. Melihat Tugas Terbawah (Pertama Masuk)");
            System.out.println("6. Hitung Jumlah Tugas Saat Ini");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    mahasiswa25 mhs = new mahasiswa25(nama, nim, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s Berhasil dikumpulkan \n", mhs.nama);
                    break;

                case 2:
                    mahasiswa25 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.print("Masukan Nilai (0-100): ");
                        int nilai = sc.nextInt();
                        sc.nextLine();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai Tugas %s adalah %d \n", dinilai.nama, nilai);
                        String biner = stack.konversiDesimalKeBiner(nilai);
                        System.out.println("Nilai Biner Tugas: " + biner);
                    }
                    break;
                
                case 3:
                    mahasiswa25 lihat = stack.peek();
                    if (lihat != null) {    
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.nama);
                    }
                    break;

                case 4:
                    System.out.println("Daftar semua tugas");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;

                case 5:
                    mahasiswa25 pertama = stack.peekTerbawah();
                    if (pertama != null) {
                        System.out.println("Tugas pertama kali dikumpulkan oleh: " + pertama.nama);
                        System.out.println("NIM: " + pertama.nim + " | Kelas: " + pertama.kelas);
                    }
                    break;

                case 6:
                    int jumlah = stack.hitungTugas();
                    System.out.println("Jumlah tugas yang sudah dikumpulkan saat ini: " + jumlah);
                    break;

                default:
                    System.out.println("invalid.");
            } 
        } while (pilih >= 1 && pilih <= 6);
    } 
}
