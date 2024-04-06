package service;

import model.Employee;
import model.EmployeeOperation;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

    List<Employee> employees = new ArrayList<>();


    public void addEmployee(Employee employee){
        employees.add(employee);
    }


    public Employee searchEmployee(int id){
        Employee employee = null;
        for (Employee emp:employees){
            if(emp.getId() == id){
                employee = emp;
                break;
            }
        }
        return employee;
    }

    public void printAllEmployees(){
        for (Employee emp:employees){
            emp.displayEmployee();
        }
    }

    public void deleteEmployee(int id){
        Employee emp = searchEmployee(id);
        if(emp != null)
            employees.remove(emp);
    }

}
