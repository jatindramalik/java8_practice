package streamdemo;

import java.util.ArrayList;
import java.util.List;

public class DataBase {

    public static List<Employee> getEmployee(){
        
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(25, "gugly", "it support", 1200000));
        list.add(new Employee(24, "gudi", "data science", 900000));
        list.add(new Employee(27, "rakhi", "ml", 700000));
        list.add(new Employee(47, "siddhu", "math", 600000));
        list.add(new Employee(19, "jua", "timepass", 500000));
        return list;

    }
    
}
