package app.model;

import java.util.Objects;

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

    @Override
    public final boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Developer developer)) return false;

        return Objects.equals(programmingLanguage, developer.programmingLanguage);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(programmingLanguage);
    }
}
