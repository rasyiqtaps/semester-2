package praktikumASD.jobsheet5;
import java.util.Scanner;

public class mahasiswaDemo25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan Jumlah mahasiswa: ");
        int jumMhs = sc.nextInt();
        sc.nextLine();
        
        mahasiswaBerprestasi25 list = new mahasiswaBerprestasi25(jumMhs); 
        
        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Mahasiswa ke-" + (i+1));
            System.out.print("NIM: "); String nim = sc.nextLine();
            System.out.print("Nama: "); String nama = sc.nextLine();
            System.out.print("Kelas: "); String kelas = sc.nextLine();
            System.out.print("IPK: "); double ipk = sc.nextDouble(); sc.nextLine();
            list.tambah(new mahasiswa25(nim, nama, kelas, ipk));
        }

        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();
        //pencarian data sequential
        System.out.println("-------------------------------------------");
        System.out.println("pencarian data");
        System.out.println("-------------------------------------------");
        System.out.println("Masukan IPK mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari = sc.nextDouble();

        System.out.println("Menggunakan sequential searching: ");
        double posisi = list.sequentialSearching(cari);
        int pss = (int)posisi;
        list.tampilPosisi(cari, pss);        
        list.tampilDataSearch(cari, pss);

        //melakukan pencarian data Binary
        System.out.println("Menggunakan Binary searching: ");
        double posisi2 = list.findBinarySearch(cari, 0, jumMhs-1);
        int pss2 = (int)posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);
    }
}