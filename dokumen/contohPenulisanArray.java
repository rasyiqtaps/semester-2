import java.util.Scanner;

public class contohPenulisanArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mataKuliah = sc.nextInt();
        sc.nextLine();

        String arrayMK[] = new String [mataKuliah];
        double arrayNilai[] = new double [mataKuliah];
        double arrayBobot[] = new double[mataKuliah];
         for (int i = 0; i < mataKuliah; i++) {
            System.out.print("Apa MK ke-" + (i+1) + " mu: ");
            arrayMK[i] = sc.nextLine();

            System.out.print("Masukan Nilai Angka untuk MK " + arrayMK[i] + ": ");
            arrayNilai[i] = sc.nextDouble();

            System.out.print("Berapa bobot untuk pelajaran " + arrayMK[i] + "mu: ");
            arrayBobot[i] = sc.nextDouble();
            sc.nextLine();
        }
    }
}
