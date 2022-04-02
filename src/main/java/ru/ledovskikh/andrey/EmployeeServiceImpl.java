package ru.ledovskikh.andrey;

/**
 * @author Andrey Ledovskikh
 */
public class EmployeeServiceImpl implements EmployeeService {

    @Override
    public Employee getEmployeeById(int Id) {
        return new EmployeeImpl(1, "Todd", "Born");
    }

    @Override
    public void deleteEmployee(Employee employee) {
        //do nothing
    }
}
