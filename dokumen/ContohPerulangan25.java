import java.util.Scanner;

public class ContohPerulangan25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jamKerja , pekerja;
        double bonus = 0.2 , gajiHarian , total;
        pekerja = 1;
        
        do {
            System.out.print("Silahkan Pekerja nomor " + pekerja + " Jam Kerja kamu: ");
            jamKerja = sc.nextInt();

            if (jamKerja > 8) {
                System.out.print("masukan total gaji per hari kamu: ");
                gajiHarian = sc.nextDouble();

                total = gajiHarian + gajiHarian * bonus;
                System.out.println("Gajimu bertambah! gajimu adalah: " + total);
                pekerja++;
                continue;

            } else if (jamKerja >= 0) {
                System.out.println("kamu tidak mendapatkan bonus.");
                pekerja++;
                
            } else {
                System.out.println("angka tidak valid. program berhenti.");
                break;
            }

        } while (true);
        System.out.println("Program selesai!");
    }
}