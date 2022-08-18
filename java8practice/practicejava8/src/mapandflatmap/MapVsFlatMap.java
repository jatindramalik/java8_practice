package mapandflatmap;

import java.util.List;

public class MapVsFlatMap {

    public static void main(String[] args) {
        List<Customer> customers = EkartDataBase.getAll();
        customers.stream().map(c -> c.getPhoneNumber()).forEach(System.out::println);
        customers.stream().flatMap(c ->c.getPhoneNumber().stream()).forEach(System.out::println);
        customers.stream().map(c -> c.getName().toUpperCase()).forEach(System.out::println);
    }
    
}
