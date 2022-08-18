package mapstreamdemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import streamdemo.Employee;

import java.util.TreeMap;

public class SortMapDemo {

    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);

        Map<Employee, Integer> employees = new TreeMap<>((arg0, arg1) -> (int) (arg0.getSalary() - arg1.getSalary()));
        employees.put(new Employee(175, "jua", "sports", 900000), 9);
        employees.put(new Employee(200, "siddu", "it", 800000), 8);
        employees.put(new Employee(321, "gudi", "ds", 700000), 7);
        employees.put(new Employee(426, "gugly", "support", 600000), 6);
        employees.put(new Employee(555, "rakhi", "account", 500000), 5);
        System.out.println(employees);

        // List<Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        // Collections.sort(list, (arg0, arg1) ->
        // arg0.getKey().compareTo(arg1.getKey()));

        // for (Entry<String, Integer> s : list) {
        // System.out.println(s);
        // }
        // map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        // map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
        employees.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary).reversed()))
                .forEach(System.out::println);

    }

}
