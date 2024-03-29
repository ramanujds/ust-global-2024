package model;

public class Accountant extends Employee {
    String department;

    public Accountant() {
    }

    public Accountant(int id, String name, double salary, String department, String username, String password) {
        super(id, name, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void displayEmployee() {
        super.displayEmployee();
        System.out.println("Department: " + department);
    }
}
