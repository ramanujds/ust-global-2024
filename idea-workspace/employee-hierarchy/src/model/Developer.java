package model;

public class Developer extends Employee{

    String programmingLanguage;

    public Developer(){ }

    public Developer(int id, String name, double salary, String programmingLanguage) {
        super(id,name,salary);
        this.programmingLanguage=programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }



    public void displayEmployee(){
       super.displayEmployee();
       System.out.println("Programming Language : "+programmingLanguage);
    }
}
