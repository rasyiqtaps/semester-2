import java.util.Scanner;

public class contohArrayLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();

        String[] alamat = {"alamak", "alamuk", "alatai", "sybau", "sialan", n, n, n, n};

        for (int i = 0; i < alamat.length; i++) {
            if (alamat[i] == "sialan") {
                System.out.println("n ketemmu di indeks " + i);
                System.out.println(alamat[i]);

                break;
            }
        }

        for (String i : alamat){
            System.out.println(i);
        }

        System.out.println("stringnnya ada: " + alamat.length);
    }
}
