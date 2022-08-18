package streamsortdemo;

import java.util.Comparator;
import java.util.HashMap;

import java.util.Map;
import java.util.TreeMap;


public class SortMapDemo {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("eight", 8);
        map.put("ten", 10);
        map.put("nine", 9);
        map.put("tweleve", 12);
        map.put("zero", 0);

        Map<Employee, Integer> employeeMap = new TreeMap<>((arg0, arg1) -> (int) (arg0.getSalary() - arg1.getSalary()));
        employeeMap.put(new Employee(101, "gugly", "support", 1200000), 12);
        employeeMap.put(new Employee(102, "gudi", "account", 900000), 9);
        employeeMap.put(new Employee(103, "rakhi", "it", 800000), 8);
        employeeMap.put(new Employee(104, "jua", "math", 700000), 7);
        System.out.println(employeeMap);

        // List<Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());

        // Collections.sort(entries, (arg0, arg1) ->
        // arg0.getKey().compareTo(arg1.getKey()));

        // for (Entry<String, Integer> entry : entries) {
        // System.out.println(entry.getKey() + ":" + entry.getValue());
        // }
        // map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        // map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
        employeeMap.entrySet().stream()
                            .sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary).reversed()))
                            .forEach(System.out::println);

    }

}
