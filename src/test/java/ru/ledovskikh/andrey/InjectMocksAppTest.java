package ru.ledovskikh.andrey;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.anyInt;


@ExtendWith(value = {MockitoExtension.class})
public class InjectMocksAppTest {

    @InjectMocks
    private EmployeeService employeeService = new EmployeeServiceImpl();

    @Mock
    private List<Employee> listOfEmployees;

    @Test
    void shouldAnswerWithTrue() {
        final Employee testEmployee = new EmployeeImpl(1, "Andrey", "Ledovskikh");

        employeeService.deleteEmployee(testEmployee);

        when(listOfEmployees.get(anyInt())).thenReturn(new EmployeeImpl(1, "Andrey", "Ledovskikh"));

        assertThat(employeeService.getEmployeeById(0)).isEqualTo(testEmployee);
    }
}
