package PraktikumASD.jobsheet1;

import java.util.Scanner;

public class praktikumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===========================================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("===========================================");

        System.out.print("Berapa mata kuliah yang kamu pelajari: ");
        int mataKuliah = sc.nextInt();
        sc.nextLine();
        
        String arrayMK[] = new String [mataKuliah];
        double arrayNilai[] = new double [mataKuliah];
        String arrayHuruf[] = new String[mataKuliah];
        double arraySKS[] = new double[mataKuliah];
        double arrayBobot[] = new double[mataKuliah];
         for (int i = 0; i < mataKuliah; i++) {
            System.out.print("Apa MK ke-" + (i+1) + " mu: ");
            arrayMK[i] = sc.nextLine();
            
            System.out.print("Berapa SKS untuk pelajaran " + arrayMK[i] + "mu: ");
            arraySKS[i] = sc.nextDouble();
            
            System.out.print("Masukan Nilai Angka untuk MK " + arrayMK[i] + ": ");
            arrayNilai[i] = sc.nextDouble();
            sc.nextLine();

        }

        for (int i = 0; i < arrayNilai.length; i++) {
        if (arrayNilai[i] > 80 && arrayNilai[i] <= 100) {
            arrayBobot[i] = 4;
            arrayHuruf[i] = "A";
        } else if (arrayNilai[i] > 73 && arrayNilai[i] <= 80) {
            arrayBobot[i] = 3.5;
            arrayHuruf[i]= "B+";
        } else if (arrayNilai[i] > 65 && arrayNilai[i] <= 73) {
            arrayBobot[i] = 3;
            arrayHuruf[i] = "B";
        } else if (arrayNilai[i] > 60 && arrayNilai[i] <= 65) {
            arrayBobot[i] = 2.5;
            arrayHuruf[i] = "C+";
        } else if (arrayNilai[i] > 50 && arrayNilai[i] <= 60) {
            arrayBobot[i] = 2;
            arrayHuruf[i] = "C";
        } else if (arrayNilai[i] > 39 && arrayNilai[i] <= 50) {
            arrayBobot[i] = 1.5;
            arrayHuruf[i] = "D";
        } else {
            arrayBobot[i] = 1;
            arrayHuruf[i] = "E";
        }

    }
    float sigma = 0;
    float alpha = 0;
    for (int i = 0; i < mataKuliah; i++) {
        sigma += (arrayBobot[i] * arraySKS[i]);
    }

    for (int i = 0; i < arraySKS.length; i++) {
        alpha += arraySKS[i];
    }
    float IP = sigma / alpha;

    
        System.out.println("=============================================");
        System.out.println("Hasil Konversi Nilai ");
        System.out.println("=============================================");

        System.out.println("MK\t\t\t\tNilai Angka\tNilai Huruf\tBobot");
        for (int i = 0; i < mataKuliah; i++) {
            System.out.printf("%-30s %.2f\t\t%s\t\t%.2f%n", arrayMK[i], arrayNilai[i], arrayHuruf[i], arrayBobot[i]);
        }


        System.out.println("=========================================");
        System.out.println("IP: " + IP);
    }
}
