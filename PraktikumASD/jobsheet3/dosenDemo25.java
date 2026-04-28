package jobsheet3;

import java.util.Scanner;

public class dosenDemo25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        dosen25[] arrayOfDosen = new dosen25[3];

        String kode, nama, cfJK;
        Boolean jenisKelamin;
        int usia;

        for (int i = 0; i < arrayOfDosen.length; i++) {
            
            System.out.println("Masukan Data Dosen ke-" + (i+1));
            System.out.print("Kode\t: ");
            kode = sc.nextLine();
            System.out.print("Nama\t: ");
            nama = sc.nextLine();
            System.out.print("Jenis Kelamin (pria/wanita)\t: ");
            cfJK = sc.nextLine();
            jenisKelamin = cfJK.equalsIgnoreCase("pria");
            System.out.print("Usia\t: ");
            usia = Integer.parseInt(sc.nextLine());
            
            arrayOfDosen[i] = new dosen25(kode, nama, jenisKelamin, usia);

        }

        System.out.println("\nData Semua Dosen");
        System.out.println("------------------------------");

        dataDosen25.dataSemuaDosen(arrayOfDosen);
        dataDosen25.jumlahDosenPerJenisKelamin(arrayOfDosen);
        dataDosen25.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
        dataDosen25.infoDosenPalingTua(arrayOfDosen);
        dataDosen25.infoDosenPalingMuda(arrayOfDosen);
    }
}