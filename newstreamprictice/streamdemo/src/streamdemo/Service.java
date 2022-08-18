package streamdemo;

import java.util.List;
import java.util.stream.Collectors;

public class Service {

    public static List<Employee> evaluateTaxUser(){
        // return DataBase.getEmployees().stream().filter(t -> t.getSalary() > 500000).collect(Collectors.toList());
        return DataBase.getEmployees().stream().sorted((t1,t2)->t1.getName().compareTo(t2.getName())).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(evaluateTaxUser());
    }
    
}
