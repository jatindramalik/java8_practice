package functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {
        Predicate<Integer> predicate = (t)->t%2 == 0;
        System.out.println(predicate.test(13)); 

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);

        list.stream().filter(t -> t % 2 != 0).forEach(System.out::println);

    }
    
}
