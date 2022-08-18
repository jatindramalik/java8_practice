package streampractice;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachDemo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("jua");
        list.add("siddhu");
        list.add("rakhi");
        list.add("gugly");
        list.add("gudi");
        list.add("krishna");
        list.add("kaveri");
        list.add("tupu");

        // for(String s : list){
        //     System.out.println(s);
        // }

        list.stream().sorted((arg0,arg1) -> arg0.compareTo(arg1)).forEach(System.out::println);
        list.stream().filter( t -> t.startsWith("g")).forEach(System.out::println);



        Map<Integer,String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");

        

        // map.forEach((key,value)->System.out.println(key + " :" + value));
        // map.entrySet().stream().forEach(s -> System.out.println(s));
        map.entrySet().stream().filter( t -> t.getValue().startsWith("t")).
        forEach(s -> System.out.println(s));

        
        
    }

}


