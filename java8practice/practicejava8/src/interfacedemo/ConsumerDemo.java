package interfacedemo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {
        Consumer<Integer> consumer = (t)->System.out.println("Print : " + t);
        consumer.accept(47);

        List<Integer> list = Arrays.asList(1,3,5,9,7,7);

        list.stream().forEach(t -> System.out.println(t));
    }
    
}
