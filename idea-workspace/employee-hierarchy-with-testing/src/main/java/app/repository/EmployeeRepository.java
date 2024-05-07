package app.repository;

import app.model.Employee;


import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {

    private List<Employee> employees;

    public EmployeeRepository() {
        this.employees = new ArrayList<>();
    }

    public EmployeeRepository(List<Employee> employees) {
        this.employees = employees;
    }

    public Employee addEmployee(Employee employee) {
        employees.add(employee);
        return employee;
    }

    public Employee searchEmployee(int id) {
       return employees.stream()
               .filter(employee -> employee.getId() == id)
               .findFirst()
               .orElse(null);
    }

    public List<Employee> getAllEmployees() {
        return employees;
    }

    public void deleteEmployee(int id) {
        Employee employee = searchEmployee(id);
        if (employee != null) {
            employees.remove(employee);
        }
    }




}
