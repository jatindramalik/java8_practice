package streamsortdemo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import streampractice.DataBase;
import streampractice.Employee;

public class SortListDemo {

    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(12);
        list.add(15);
        list.add(7);
        list.add(10);
        // Collections.sort(list);
        // Collections.reverse(list);
        // System.out.println(list);

        // list.stream().sorted().forEach(System.out::println);
        // list.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);

        List<Employee> employees = DataBase.getEmployees();
        

        // employees.stream().sorted((emp0,emp1) -> emp0.getName().compareTo(emp1.getName())).forEach(System.out::println);
        // employees.stream().sorted(Comparator.comparing(emp -> emp.getSalary())).forEach(System.out::println);
        employees.stream().sorted(Comparator.comparing(Employee::getDept)).forEach(System.out::println);

    }
    
}



