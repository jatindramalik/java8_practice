package streamdemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ForEachDemo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("jua");
        list.add("siddhu");
        list.add("gudi");
        list.add("gugly");
        list.add("raki");

        // for (String string : list) {
        //     System.out.println(string);
        // }

        // list.stream().forEach(System.out::println);
        // list.stream().filter(t -> t.startsWith("g")).
        // forEach(System.out::println);

        Map<Integer,String> map = new HashMap<>();
        map.put(1, "one");
        map.put(3, "three");
        map.put(2, "two");
        map.put(4, "four");
        map.put(5, "five");

        // List<Entry<Integer,String>> entries = new ArrayList<>(Map.Entry);

        // map.forEach((k,v) -> System.out.println(k + ":" + v));
        // map.entrySet().stream().forEach(System.out::println);
        map.entrySet().stream().filter(t -> t.getValue().startsWith("t")).
        forEach(System.out::println);

    }
    
}
