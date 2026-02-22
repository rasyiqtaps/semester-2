import java.util.Scanner;

public class contohArrayDuplikaat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int [][] stock = {
            {12, 15, 17, 19},
            {9, 89, 76, 4},
            {10, 123,134,12}
        };

        System.out.println("Berikut nomor yang kami sediakan: ");
        for (int i = 0; i < stock.length; i++) {
            for (int temp : stock[i]) {
                System.out.print(temp + "\t");
            }
        System.out.println(" ");
        }

        System.out.print("masukan nomor yang ingin kamu ketik: ");
        while (true) {
        String input = sc.nextLine();
String[] angka = input.split("\\s+");

for (String a : angka) {
    int hint = Integer.parseInt(a);
    boolean ketemu = false;

    for (int[] baris : stock) {
        for (int nilai : baris) {
            if (hint == nilai) {
                System.out.println(hint + " → ketemu");
                ketemu = true;
            }
        }
    }

    if (!ketemu) {
        System.out.println(hint + " → tidak ada");
    }
}
        }
    }
}
