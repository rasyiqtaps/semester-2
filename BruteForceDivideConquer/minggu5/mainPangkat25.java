package BruteForceDivideConquer.minggu5;

import java.util.Scanner;

public class mainPangkat25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Jumlah elemen: ");
        int elemen = input.nextInt();

        pangkat25[] png = new pangkat25[elemen];
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukan nilai basis elemen ke-" + (i+1) + ": ");
            int basis = input.nextInt();
            System.out.print("Masukan nilai pangkat elemen ke-" + (i+1) + ": ");
            int pangkat = input.nextInt();
            png[i] = new pangkat25(basis, pangkat);
        }

        System.out.println("HASIL PANGKAT BRUTEFORCE: ");
        for (pangkat25 p : png) {
            System.out.println(p.nilai + "^" + p.pangkat+ ": " + p.pangkatBF(p.nilai, p.pangkat));
        }

        System.out.println("HASIL PAGKAT DIVIDE AND CONQUER:");
        for (pangkat25 p : png) {
            System.out.println(p.nilai+"^"+p.pangkat+": "+p.pangkatDC(p.nilai, p.pangkat));
        }
    }
}
