package streampractice;

import java.util.ArrayList;
import java.util.List;

public class DataBase {

    public static List<Employee> getEmployees(){
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "gugly", "support", 1200000));
        employees.add(new Employee(102, "gudi", "account", 900000));
        employees.add(new Employee(103, "rakhi", "it", 800000));
        employees.add(new Employee(104, "jua", "math", 700000));

        return employees;

        
    }
    
}
