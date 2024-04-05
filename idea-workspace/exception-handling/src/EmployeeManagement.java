import java.util.ArrayList;
import java.util.List;

public class EmployeeManagement {

    List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) throws InvalidEmployeeIDException {

        // Method should throw Exception if the following conditions are not satisfied
        // id should be positive and 3 digit
        // name should not be blank and should contain at least 3 characters
        // email should not be blank should be a valid email
        if(!(employee.getId()>=100 && employee.getId()<=999)){
            throw new InvalidEmployeeIDException("Invalid ID : "+employee.getId());
        }
        employees.add(employee);
        System.out.println("Employee ["+employee+"] Added Successfully");
    }


    public static void main(String[] args) {
        EmployeeManagement employeeManagement = new EmployeeManagement();

        Employee emp = new Employee(110,"Harsh","harsh@yahoo.com");
        try {
            employeeManagement.addEmployee(emp);
        }
        catch (InvalidEmployeeIDException ex){
            System.out.println(ex.getMessage());
        }

    }


}
