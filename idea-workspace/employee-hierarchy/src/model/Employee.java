package model;

public class Employee {

    int id;
    String name;
    double salary;



    public void displayEmployee(){
        System.out.println(this.getClass().getSimpleName()+" Details : ");
        System.out.println("ID : "+id);
        System.out.println("Name : "+name);
        System.out.println("Salary : "+salary);
    }


    public Employee() {
    }

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
