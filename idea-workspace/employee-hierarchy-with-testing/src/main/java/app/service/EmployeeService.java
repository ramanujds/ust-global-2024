package app.service;



import app.model.Employee;
import app.repository.EmployeeRepository;

import java.util.List;

public class EmployeeService {

    private EmployeeRepository repository = new EmployeeRepository();

    public void setRepository(EmployeeRepository repository) {
        this.repository = repository;
    }

    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    public EmployeeService() {
    }

    public Employee addEmployee(Employee employee){

       return repository.addEmployee(employee) ;
    }


    public Employee searchEmployee(int id){

        return repository.searchEmployee(id);
    }

    public List<Employee> getAllEmployees(){
       return repository.getAllEmployees();
    }

    public void deleteEmployee(int id){
        repository.deleteEmployee(id);
    }

}
