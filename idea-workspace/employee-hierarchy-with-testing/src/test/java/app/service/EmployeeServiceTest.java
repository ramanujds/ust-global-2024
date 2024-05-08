package app.service;

import app.model.Employee;
import app.model.Manager;
import app.repository.EmployeeRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class EmployeeServiceTest {

    @InjectMocks
    private EmployeeService service;

    @Mock
    private EmployeeRepository repository;


    @Test
    void testAddEmployee() {
        // Given
        Employee emp = new Manager(501, "Bhuban", 76000, 15);

        // When
        Mockito.when(repository.addEmployee(emp)).thenReturn(emp);

        // Then
        Assertions.assertEquals(emp, service.addEmployee(emp));

        // Verify
        Mockito.verify(repository,Mockito.times(1)).addEmployee(emp);
    }


    @Test
    void testSearchEmployee() {
        // Given
        Employee emp = new Manager(501, "Bhuban", 76000, 15);

        // When
        Mockito.when(repository.searchEmployee(emp.getId())).thenReturn(emp);

        // Then
        Assertions.assertEquals(emp, service.searchEmployee(emp.getId()));

        // Verify
        Mockito.verify(repository, Mockito.times(1)).searchEmployee(emp.getId());

    }

    @Test
    void testDeleteEmployee() {
        // Given
        int id = 101;
        // When
        Mockito.doNothing().when(repository).deleteEmployee(id);

        // Then
        service.deleteEmployee(id);

        // Verify
        Mockito.verify(repository, Mockito.times(1)).deleteEmployee(id);
    }

}
