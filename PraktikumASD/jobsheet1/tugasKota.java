package PraktikumASD.jobsheet1;

public class tugasKota {
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
        System.out.println("berikut adalah kode dari beberapa kota: ");
        for (int i = 0; i < kode.length; i++) {
            for (int j = 0; j < kota.length; j++) {
                for (int j2 = 0; j2 < kota[i].length; j2++) {
                    System.out.print(kode[i] + "\n");
                    System.out.print("");
                }
            }
        }
    }
}
