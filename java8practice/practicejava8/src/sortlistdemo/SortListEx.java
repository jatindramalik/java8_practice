package sortlistdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import streamdemo.DataBase;
import streamdemo.Employee;

public class SortListEx {

    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(7);
        list.add(8);
        list.add(10);
        // Collections.sort(list);
        // System.out.println(list);
        // Collections.reverse(list);
        // System.out.println(list);
        // list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        List<Employee> employees = DataBase.getEmployee();

        //System.out.println(employees);

        // employees.stream().sorted((e1,e2)->(int) (e1.getSalary()-e2.getSalary())).forEach(System.out::println);
        // employees.stream().sorted(Comparator.comparing(Employee::getSalary) ).forEach(System.out::println);
        employees.stream().sorted(Comparator.comparing(e -> e.getSalary()) ).forEach(System.out::println);
        

    }
    
}
// class MyComparator implements Comparator<Employee>{

//     @Override
//     public int compare(Employee arg0, Employee arg1) {
       
//         return arg0.getName().compareTo(arg1.getName());
//     }
    
// }
