package app.service;

import app.model.Employee;
import app.model.Manager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmployeeServiceIntegrationTest {

    private EmployeeService service;

    @BeforeEach
    void setUp(){
        service = new EmployeeService();
    }

    @Test
    void testAddEmployee(){
        // Given
        Employee emp = new Manager(501,"Bhuban",76000,15);

        // When
        Employee savedEmployee = service.addEmployee(emp);

        // Then

        Assertions.assertEquals(emp,savedEmployee);

    }

}
