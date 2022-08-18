package streamdemo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortListDemo {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(10);
        list.add(8);
        list.add(5);

        // list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        // DataBase.getEmployees().stream().sorted(Comparator.comparing(t -> t.getSalary())).forEach(System.out::println);
        // DataBase.getEmployees().stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);
        DataBase.getEmployees().stream().filter(t->t.getId()%2==0).sorted(Comparator.comparing(t -> t.getSalary())).forEach(System.out::println);

    }
    
}
