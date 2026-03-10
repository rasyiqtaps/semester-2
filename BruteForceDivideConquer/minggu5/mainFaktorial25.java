package BruteForceDivideConquer.minggu5;

import java.util.Scanner;

public class mainFaktorial25 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        
        System.out.print("Masukan Nilai: ");
        int nilai = Input.nextInt();

        faktorial25 fk = new faktorial25();
        System.out.println("Nilai Faktorial "+ nilai + "Menggunakan BF: " + fk.faktorialBF(nilai));
        System.out.println("Nilai Faktorial "+ nilai + "Menggunakan DC: " + fk.faktorialDC(nilai));
    }
    
}
