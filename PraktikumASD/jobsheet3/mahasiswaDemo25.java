package jobsheet3;
import java.util.Scanner;

public class mahasiswaDemo25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        mahasiswa25[] arrayOfMahasiswa = new mahasiswa25[3];
        String dummy;

        for (int i = 0; i < 3; i++) {
            arrayOfMahasiswa[i] = new mahasiswa25();

            System.out.println("Masukan data Mahasiswa ke-" + (i+1));
            System.out.print("NIM\t: ");
            arrayOfMahasiswa[i].nim = sc.nextLine();
            System.out.print("Nama\t: ");
            arrayOfMahasiswa[i].nama = sc.nextLine();
            System.out.print("Kelas\t: ");
            arrayOfMahasiswa[i].kelas = sc.nextLine();
            System.out.print("IPK\t: ");
            dummy = sc.nextLine();
            arrayOfMahasiswa[i].ipk = Float.parseFloat(dummy);
            System.out.println("-------------------------------------------");
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            arrayOfMahasiswa[i].cetakInfo();
        }
    }
}
