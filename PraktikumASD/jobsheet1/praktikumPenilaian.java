package jobsheet1;

import java.util.Scanner;

public class praktikumPenilaian {
    static double[] nilai = new double[4];
    static double[] outerlayer(double nilai[]){
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Masukan Nilai Tugas: ");
            int counter = 0;

            nilai[0] = sc.nextDouble();
            if (nilai[0] <= 100 && nilai[0] >= 0) {
                counter++;
            }

            System.out.print("Masukan Nilai Kuis: ");
            nilai[1] = sc.nextDouble();
            if (nilai[1] <= 100 && nilai[1] >= 0) {
                counter++;
            }

            System.out.print("Masuka Nilai UTS: ");
            nilai[2] = sc.nextDouble();
            if (nilai[2] <= 100 && nilai[2] >= 0) {
                counter++;
            }

            System.out.print("Masukan Nilai UAS: ");
            nilai[3] = sc.nextDouble();
            if (nilai[3] <= 100 && nilai[3] >= 0) {
                counter++;
            }

            if (counter == 4) {
                break;
            } else {
                System.out.println("===============================");
                System.out.println("===============================");
                System.out.println("nilai tidak valid");
                System.out.println("===============================");
                System.out.println("===============================");
            }
        }
            return nilai; 
        }

    
    static void pengujian(double[] nilai) {
        double nilaiAkhir = 0;
        String nilaiHuruf;
        double tugas = nilai[0] * 0.2;
        double kuis = nilai[1] * 0.2;
        double uts = nilai[2] * 0.3;
        double uas = nilai[3] * 0.3;

        double total = tugas + kuis + uts + uas;
        if (total > 80 && total <= 100) {
            nilaiAkhir = total;
            nilaiHuruf = "A";
        } else if (total > 73 && total <= 80) {
            nilaiAkhir = total;
            nilaiHuruf = "B+";
        } else if (total > 65 && total <= 73) {
            nilaiAkhir = total;
            nilaiHuruf = "B";
        } else if (total > 60 && total <= 65) {
            nilaiAkhir = total;
            nilaiHuruf = "C+";
        } else if (total > 50 && total <= 60) {
            nilaiAkhir = total;
            nilaiHuruf = "C";
        } else if (total > 39 && total <= 50) {
            nilaiAkhir = total;
            nilaiHuruf = "D";
        } else if (total <= 39) {
            nilaiAkhir = total;
            nilaiHuruf = "E";
        } else {
            nilaiAkhir = total;
            nilaiHuruf = "Bugg";
        }

        System.out.println("nilai akhir: " + nilaiAkhir);
        System.out.println("nilai huruf: " + nilaiHuruf);
    }
    public static void main(String[] args) {
        System.out.println("Program Menghitung Tugas Akhir");
        System.out.println("===============================");
        outerlayer(nilai);
        pengujian(nilai);
        System.out.println("===============================");
        System.out.println("===============================");
    }
}
