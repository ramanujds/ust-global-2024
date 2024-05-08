package app.repository;


import app.model.Developer;
import app.model.Employee;
import app.model.Manager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryTest {

    private EmployeeRepository repository;

    @BeforeEach
    public void setUp(){
        Employee e1 = new Manager(101,"Harshit",50000,10);
        Employee e2 = new Manager(102,"Karan",80000,10);
        Employee e3 = new Developer(103,"Steve",90000,"Java");
        Employee e4 = new Developer(104,"John",100000,"Python");
        List<Employee> employees = new ArrayList<>(List.of(e1,e2,e3,e4));
        repository = new EmployeeRepository(employees);

    }

    @AfterEach
    public void tearDown(){
        repository = null;
    }

    @Test
    void testSearchEmployee(){

        // Given
        int id = 101;
        Employee e1 = new Manager(101,"Harshit",50000,10);

        // When
        Employee emp = repository.searchEmployee(id);


        // Then
        Assertions.assertEquals(e1,emp);

    }

    @Test
    void testAddEmployee(){
        // Given

        Employee emp = new Developer(201,"Nived",54000,"Java Script");

        // When
        Employee savedEmployee = repository.addEmployee(emp);

        // Then
        Assertions.assertEquals(emp,savedEmployee);


    }


}
