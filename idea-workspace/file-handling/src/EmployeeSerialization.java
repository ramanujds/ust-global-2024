import java.io.*;

public class EmployeeSerialization {

    public static void main(String[] args) {

//        Employee emp = new Employee(101,"Gaurav",25);
//        try {
//            FileOutputStream outputStream = new FileOutputStream("employee.ser");
//            ObjectOutputStream objectOutput = new ObjectOutputStream(outputStream);
//            objectOutput.writeObject(emp);
//            objectOutput.close();
//            objectOutput.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        try {
            FileInputStream inputStream = new FileInputStream("employee.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            Employee emp = (Employee) objectInputStream.readObject();
            System.out.println(emp);
//            var obj = objectInputStream.readObject();
//            if(obj instanceof Employee e){
//                System.out.println(e);
//            }
        }
        catch (IOException | ClassNotFoundException ex){
            System.out.println(ex.getMessage());
        }


    }

}
