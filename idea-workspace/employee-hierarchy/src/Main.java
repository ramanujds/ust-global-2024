import model.Developer;
import model.Employee;
import model.Manager;

public class Main {
    public static void main(String[] args) {

//        Employee employee = new Employee(101,"Harsh",50000);
//        employee.displayEmployee();

        Employee employee;

        employee = new Manager(101,"Harshit",50000,10);
        employee.displayEmployee();

        employee = new Developer(102,"Karan",80000,"Java");
        employee.displayEmployee();


    }
}