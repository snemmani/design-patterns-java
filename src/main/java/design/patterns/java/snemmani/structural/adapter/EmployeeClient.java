package design.patterns.java.snemmani.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {
    public List<Employee> getEmployeeList() {
        List<Employee> employees = new ArrayList<>();
        Employee employeeFromDB = new EmployeeDB("1234", "John", "Wick", "john@wick.com");
        EmployeeLdap employeeFromLdap = new EmployeeLdap("1235", "Solo", "Han", "han@solo.com");

        Employee employeeFromLdapAdapter = new EmployeeAdapterFromLdap(employeeFromLdap);

        employees.add(employeeFromDB);
        employees.add(employeeFromLdapAdapter);
        return employees;
    }
}
