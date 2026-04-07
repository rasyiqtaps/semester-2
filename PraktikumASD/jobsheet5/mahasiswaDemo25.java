package PraktikumASD.jobsheet5;
import java.util.Scanner;

public class mahasiswaDemo25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = sc.nextInt();
        sc.nextLine();
        
        mahasiswaBerprestasi25 list = new mahasiswaBerprestasi25(n); 
        
        for (int i = 0; i < n; i++) {
            System.out.println("Mahasiswa ke-" + (i+1));
            System.out.print("NIM: "); String nim = sc.nextLine();
            System.out.print("Nama: "); String nama = sc.nextLine();
            System.out.print("Kelas: "); String kelas = sc.nextLine();
            System.out.print("IPK: "); double ipk = sc.nextDouble(); sc.nextLine();
            list.tambah(new mahasiswa25(nim, nama, kelas, ipk));
        }

        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC): ");
        list.bubbleSort();
        list.tampil();

        // Bagian bawah ini tetap sama seperti kode aslimu
        System.out.println("Data mahasiswa yang sudah terurut menggunakan SELECTION SORT (ASC) ");
        list.selectionSort();
        list.tampil();

        System.out.println("Data yang sudah terurur menggunakan INSERTION SORT (ASC) secara DECENDING");
        list.insertionSort();
        list.tampil();
    }
}