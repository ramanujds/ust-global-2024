import model.Developer;
import model.Employee;
import model.EmployeeOperation;
import model.Manager;
import service.EmployeeService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Employee employee = new Employee(101,"Harsh",50000);
//        employee.displayEmployee();

 //       Employee employee;


      Employee  emp1 = new Manager(101,"Harshit",50000,10);

      System.out.println(emp1);



      Employee emp2 = new Developer(102,"Karan",80000,"Java");

        Scanner scan = new Scanner(System.in);


        EmployeeService employeeService = new EmployeeService();

        employeeService.addEmployee(emp1);
        employeeService.addEmployee(emp2);

//        employeeService.printAllEmployees();
// Searching for employee

//        System.out.println("Enter employee id : ");
//        int id = scan.nextInt();
//
//        Employee emp = employeeService.searchEmployee(id);
//        if(emp != null)
//             emp.displayEmployee();
//        else
//            System.out.println("No employee found with id : "+id);


        // Deleting Employee

        System.out.println("Enter employee id : ");
        int id = scan.nextInt();

        employeeService.deleteEmployee(id);

        // Printing
        System.out.println("After Deleting : ");
        employeeService.printAllEmployees();


    }
}