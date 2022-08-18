package streampractice;

import java.util.List;
import java.util.stream.Collectors;

public class TaxService {

    public static List<Employee> evaluateTaxUser() {
        return DataBase.getEmployees().stream().filter(emp -> emp.getSalary() > 700000).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(TaxService.evaluateTaxUser());
    }

}
