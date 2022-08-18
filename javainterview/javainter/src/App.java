import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args)  {

        List<Empl> employees = new ArrayList<>();
        employees.add(new Empl(101, "JK", "it", 700000));
        employees.add(new Empl(102, "MK", "ut", 800000));
        employees.add(new Empl(103, "GK", "mt", 900000));
        employees.add(new Empl(104, "SK", "at", 1000000));
        employees.add(new Empl(105, "BK", "zt", 500000));

        // employees.stream().sorted(Comparator.comparing(Empl::getSalary)).forEach(System.out::println);
        // employees.stream().filter(t -> t.getEid()%2 == 0).forEach(System.out::println);
        // employees.stream().filter(t -> t.getEname().startsWith("G")).forEach(System.out::println);
        // employees.stream().filter(t -> t.getEid()>102).forEach(System.out::println);
        Map<Empl,Integer> empMap =employees.stream().collect(Collectors.toMap(t->t, Empl::getEid));
        empMap.entrySet().stream().forEach(System.out::println);

        List<Entry<Empl,Integer>> entries = new ArrayList<>(map.entrySet());



    }
}
