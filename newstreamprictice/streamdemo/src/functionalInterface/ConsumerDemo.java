package functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {
        
        Consumer<Integer> consumer = (t)->System.out.println("Print :" + t);
        consumer.accept(125);

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
        list.stream().forEach(System.out::println);
       
    }
    
}
