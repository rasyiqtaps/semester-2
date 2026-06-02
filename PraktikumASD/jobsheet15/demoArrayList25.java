package jobsheet15;

import java.util.ArrayList;
import java.util.Collections;

public class demoArrayList25 {
    public static void main(String[] args) {
        ArrayList<customer25> customers = new ArrayList<>();
        
        customer25 customer1 = new customer25(1, "Zakia");
        customer25 customer2 = new customer25(5, "Budi");
        
        customers.add(customer1);
        customers.add(customer2);
        customers.add(new customer25(4, "Cica"));
        
        customers.add(2, new customer25(100, "Rosa"));
        
        ArrayList<customer25> newCustomers = new ArrayList<>();
        newCustomers.add(new customer25(201, "Della"));
        newCustomers.add(new customer25(202, "Victor"));
        newCustomers.add(new customer25(203, "Sarah"));
        customers.addAll(newCustomers);
        
        customers.sort((c1, c2) -> c1.name.compareTo(c2.name));
        
        System.out.println(customers);
    }
}