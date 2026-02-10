package PraktikumASD.jobsheet1;

import java.util.Scanner;

public class tugas1Kota {
    private static char[] kode = {'a', 'b', 'd', 'e', 'f', 'g', 'h', 'l', 'n', 't'};
    private static char[][] kota =      {{'B','A','N','T','E','N'},
                                        {'J','A','K','A','R','T','A'},
                                        {'B','A','N','D','U','N','G'},
                                        {'C','I','R','E','B','O','N'},
                                        {'B','O','G','O','R'},
                                        {'P','E','K','A','L','O','N','G','A','N'},
                                        {'S','E','M','A','R','A','N','G'},
                                        {'S','U','R','A','B','A','Y','A'},
                                        {'M','A','L','A','N','G'},
                                        {'T','E','G','A','L'}};
    public static void main(String[] args) {
        pencarianKode();
    }
    static void pencarianKode(){
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        boolean p = true;
        while (p) {
            System.out.print("masukan kode kota: ");
            char code = sc.next().charAt(0);
            for (int i = 0; i < kode.length; i++) {
                if (code == kode[i]) {
                    counter = i;
                    System.out.print("kodemu adalah kota ");
                    for (int j = 0; j < kota[counter].length; j++) {
                        System.out.print(kota[counter][j]);
                    }
                    p = false;
                    
                }
            }
        }

        
    }
}
