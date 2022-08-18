package mapstreamdemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EkartDataBase {

    public static List<Customer> getAll(){
        return Stream.of(
            new Customer(101,"jua","jua@gmail.com",Arrays.asList("123456","258456")),
            new Customer(102,"gudi","gudi@gmail.com",Arrays.asList("148951","3578963")),
            new Customer(103,"siddhu","siddhu@gmail.com",Arrays.asList("789456","357159")),
            new Customer(104,"gugly","gugly@gmail.com",Arrays.asList("021584","3125488"))
        ).collect(Collectors.toList());
    }
    
}
