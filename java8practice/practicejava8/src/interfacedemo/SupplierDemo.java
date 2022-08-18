package interfacedemo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {

    public static void main(String[] args) {
        Supplier <String> supplier = ()->"Hi jatin u can do it";
    
        System.out.println(supplier.get());

        List<String> list = Arrays.asList();

 
        System.out.println( list.stream().findAny().orElseGet(()-> "u only can do it"));

    }
    
}
