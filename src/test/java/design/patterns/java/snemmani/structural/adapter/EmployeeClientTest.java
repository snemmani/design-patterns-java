package design.patterns.java.snemmani.structural.adapter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeClientTest {
    @Test
    public void testEmployeeClient() {
        EmployeeClient employeeClient = new EmployeeClient();
        List<Employee> employeeList = employeeClient.getEmployeeList();

        assertTrue(employeeList.size() == 2);
        employeeList.get(0).getId();
        assertTrue(employeeList.get(0).getId().equals("1234"));
        assertTrue(employeeList.get(0).getFirstName().equalsIgnoreCase("John"));
        assertTrue(employeeList.get(0).getLastName().equalsIgnoreCase("Wick"));
        assertTrue(employeeList.get(0).getEmail().equals("john@wick.com"));

        assertTrue(employeeList.get(1).getId().equals("1235"));
        assertTrue(employeeList.get(1).getFirstName().equalsIgnoreCase("Han"));
        assertTrue(employeeList.get(1).getLastName().equalsIgnoreCase("Solo"));
        assertTrue(employeeList.get(1).getEmail().equals("han@solo.com"));
    }
}
