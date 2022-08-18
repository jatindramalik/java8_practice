package interfacedemo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

class SupplierEx implements Supplier<String> {

    @Override
    public String get() {
        
        return "Jatin u can do it";
    }
    
}
public class SupplierDemo {

    public static void main(String[] args) {
        Supplier<String> supplier = ()->"jatin u can do it";

        System.out.println(supplier.get());

        List<String> list = Arrays.asList();
        System.out.println(list.stream().findAny().orElseGet(()->"keep patience"));
    }
    
}
