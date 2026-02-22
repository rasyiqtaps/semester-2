public class contohArray {
    public static void main(String[] args) {

        String[] alamat = {"alamak", "alamuk", "alatai", "sybau", "sialan"};

        for (int i = 0; i < alamat.length; i++) {

            i *= 2;
            System.out.println(i);
            i /= 2;

        }

        System.out.println("stringnnya ada: " + alamat.length);
    }
}
