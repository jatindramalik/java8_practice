package streamdemo;

import java.util.List;
import java.util.stream.Collectors;

public class TaxService {

    public static List<Employee> evaluateTaxUser(){
        return DataBase.getEmployee().stream().filter(t -> t.getSalary()>500000).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(evaluateTaxUser());
    }
    
}
