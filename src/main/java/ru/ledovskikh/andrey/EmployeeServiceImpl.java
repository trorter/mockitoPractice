package ru.ledovskikh.andrey;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Andrey Ledovskikh
 */
public class EmployeeServiceImpl implements EmployeeService {

    private List<Employee> listOfEmployees = List.of(new EmployeeImpl(1, "Todd", "Born"));

    @Override
    public Employee getEmployeeById(int Id) {
        return listOfEmployees.get(0);
    }

    @Override
    public void deleteEmployee(Employee employee) {
        //do nothing
    }
}
