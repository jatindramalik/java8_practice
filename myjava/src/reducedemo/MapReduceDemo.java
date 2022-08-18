package reducedemo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MapReduceDemo {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12,45,2,3,5,6);
        List<String> words = Arrays.asList("corejava","springboot","hibernate");

        
        int sum = 0;
        for(Integer num: numbers){
            sum = sum + num;
        }
        System.out.println(sum);
        int sum2 = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum2);
        Integer reduceSum = numbers.stream().reduce(0, (a,b)-> a+b);
        System.out.println(reduceSum);
        Optional<Integer> reduceSum2 = numbers.stream().reduce(Integer::max);
        System.out.println(reduceSum2.get());
        String longeststring = words.stream().reduce((w1,w2)->w1.length()>w2.length()?w1:w2).get();
        System.out.println(longeststring);

    }
    
}
