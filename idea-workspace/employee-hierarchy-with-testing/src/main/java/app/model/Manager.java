package app.model;

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

    @Override
    public void displayEmployee(){

        System.out.println(this.getClass().getSimpleName() + " Details : ");
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Salary : " + salary);
        System.out.println("Team size : "+teamSize);
    }


    public void work() {
        System.out.println("Manager is working");
    }


    public void requestForLeave() {
        System.out.println("Manager Requested for leave");
    }

//    @Override
//    public String toString(){
//        return "Employee - ID : "+id+" | Name : "+name+" | Salary : "+salary;
//    }


    @Override
    public String toString() {
        return "Manager{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public final boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Manager manager)) return false;

        return teamSize == manager.teamSize;
    }

    @Override
    public int hashCode() {
        return teamSize;
    }
}
