package mapstreamdemo;

import java.util.List;

public class MapVsFlatMap {

    public static void main(String[] args) {
        List<Customer> customers = EkartDataBase.getAll();
        customers.stream().map(c -> c.getPhoneNumber()).forEach(System.out::println);
        customers.stream().flatMap(c -> c.getPhoneNumber().stream()).forEach(System.out::println);
    }
    
}
