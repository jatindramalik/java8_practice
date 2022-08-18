package functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {

    public static void main(String[] args) {
        Supplier<String> supplier = ()-> "Hii Jatin u can do it";
        // System.out.println(supplier.get());

        List<String> list = Arrays.asList();
       System.out.println(list.stream().findAny().orElseGet(()->"Hii keep faith on u"));
    }
    
}
