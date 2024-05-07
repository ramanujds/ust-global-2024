package com.app.model;

public class Developer extends Employee {

    String programmingLanguage;

    public Developer() {
    }

    public Developer(int id, String name, double salary, String programmingLanguage) {
        super(id, name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }


    public void displayEmployee() {
        System.out.println(this.getClass().getSimpleName() + " Details : ");
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Salary : " + salary);
        System.out.println("Programming Language : " + programmingLanguage);
    }

    public void work() {
        System.out.println("Developer is working");
    }


    public void requestForLeave() {
        System.out.println("Developer Requested for leave");
    }

}
