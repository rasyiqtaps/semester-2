package jobsheet1;

import java.util.Scanner;

public class praktikumPerulangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nim = 0.0, n;
        System.out.print("Masukan Nim Anda: ");
        nim = sc.nextDouble();
        n = nim % 100;

        System.out.println(n);

        for (int i = 1; i <= n; i++) {
            if (i == 10 || i == 15) {

            } else if (i % 3 == 0){
                System.out.print("# ");
            } else if (i % 2 == 1){
                System.out.print("* ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
