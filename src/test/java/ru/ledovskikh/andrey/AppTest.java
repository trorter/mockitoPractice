package ru.ledovskikh.andrey;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;

import static org.mockito.Mockito.verify;

import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;


@ExtendWith(value = {MockitoExtension.class})
public class AppTest {

    @Mock
    private EmployeeService employeeService;

    @Captor
    private ArgumentCaptor<Employee> employeeArgumentCaptor;

    @Test
    void shouldAnswerWithTrue() {
        final Employee testEmployee = new EmployeeImpl(1, "Andrey", "Ledovskikh");

        employeeService.deleteEmployee(testEmployee);

        verify(employeeService).deleteEmployee(employeeArgumentCaptor.capture());

        assertThat(employeeArgumentCaptor.getValue()).isEqualTo(testEmployee);
    }
}
