package mapandflatmap;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {
    public static void main(String[] args) {
        List<Customer> customers = EkartDataBase.getAll();

        List<List<String>> phone = customers.stream().map(c -> c.getPhoneNumber()).collect(Collectors.toList());
        System.out.println(phone);

        List<String> phonenumflatmap = customers.stream().flatMap(c-> c.getPhoneNumber().stream())
        .collect(Collectors.toList());
        System.out.println(phonenumflatmap);
        customers.stream().map(c -> c.getName().toUpperCase()).forEach(System.out::println);
        customers.stream().flatMap(c-> c.getPhoneNumber().stream()).forEach(System.out::println);
    }
}
