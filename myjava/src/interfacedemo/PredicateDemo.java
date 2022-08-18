package interfacedemo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

// class PredicateEx implements Predicate<Integer> {

//     @Override
//     public boolean test(Integer t) {
//        if( t%2 == 0){
//         return true;
//        }else
//         return false;
//     }
    
// }
public class PredicateDemo {

    public static void main(String[] args) {
        Predicate<Integer> predicate = (t)-> t%2 == 0;
            
        System.out.println(predicate.test(5));

        List<Integer> num = Arrays.asList(1, 5, 7, 3, 8,12,24,48);

        num.stream().filter(t -> t%2 ==0).forEach(t -> System.out.println(t));

    }
    
}
