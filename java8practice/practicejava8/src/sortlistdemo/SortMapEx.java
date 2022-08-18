package sortlistdemo;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

import streamdemo.Employee;

public class SortMapEx {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);

        List<Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());

        Collections.sort(entries, (arg0, arg1) -> arg0.getKey().compareTo(arg1.getKey()));
        for (Entry<String, Integer> entry : entries) {

            System.out.println(entry.getKey() + " " + entry.getValue());

        }

        // map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        // map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

        Map<Employee, Integer> eMap = new TreeMap<>((arg0, arg1) -> (int) (arg0.getSalary() - arg1.getSalary()));
        eMap.put(new Employee(25, "gugly", "it support", 1200000), 12);
        eMap.put(new Employee(24, "gudi", "data science", 900000), 9);
        eMap.put(new Employee(27, "rakhi", "ml", 700000), 7);
        eMap.put(new Employee(47, "siddhu", "math", 600000), 6);
        eMap.put(new Employee(19, "jua", "timepass", 500000), 5);

        System.out.println(eMap);
        // eMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary).reversed()))
        // .forEach(System.out::println);

        eMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
    }

}
