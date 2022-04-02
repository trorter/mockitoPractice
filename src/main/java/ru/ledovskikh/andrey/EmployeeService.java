package ru.ledovskikh.andrey;

/**
 * @author Andrey Ledovskikh
 */
public interface EmployeeService {

    Employee getEmployeeById(int Id);

    void deleteEmployee(Employee employee);
}
