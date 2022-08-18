package interfacedemo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class ConsumerEx implements Consumer<Integer> {

    @Override
    public void accept(Integer t) {
        System.out.println("Printing : " + t);

    }

}

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<Integer> consumer = (t) -> System.out.println(t);
        consumer.accept(125);

        List<Integer> num = Arrays.asList(1, 5, 7, 3, 8);

        num.stream().forEach(t -> System.out.println(t));

    }
}
