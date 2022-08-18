package streamdemo;

import java.util.ArrayList;
import java.util.List;

public class DataBase {

    public static List<Employee> getEmployees(){

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(175, "jua", "sports", 900000));
        employees.add(new Employee(200, "siddu", "it", 800000));
        employees.add(new Employee(321, "gudi", "ds", 700000));
        employees.add(new Employee(426, "gugly", "support", 600000));
        employees.add(new Employee(555, "rakhi", "account", 500000));
        return employees;

    }
    
}
