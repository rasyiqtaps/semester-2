package jobsheet15;

import java.util.ArrayList;
import java.util.Collections;

public class sortingDemo25 {
    public static void main(String[] args) {

        ArrayList<String> daftarSiswa = new ArrayList<>();
        daftarSiswa.add("Zainab");
        daftarSiswa.add("Andi");
        daftarSiswa.add("Rara");
        
        Collections.sort(daftarSiswa);
        System.out.println("Data setelah diurutkan: " + daftarSiswa);
        
        ArrayList<customer25> customers = new ArrayList<>();
        customers.add(new customer25(1, "Zakia"));
        customers.add(new customer25(5, "Budi"));
        customers.add(new customer25(4, "Cica"));
        
        customers.sort((c1, c2) -> c1.name.compareTo(c2.name));
        System.out.println("Customer setelah diurutkan: " + customers);
    }
}