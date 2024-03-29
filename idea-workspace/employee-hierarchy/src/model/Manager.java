package model;

public class Manager extends Employee{

    int teamSize;

    public Manager(){ }



    public Manager(int id, String name, double salary, int teamSize) {
        super(id,name,salary);
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public void displayEmployee(){
        super.displayEmployee();
        System.out.println("Team size : "+teamSize);
    }

}
