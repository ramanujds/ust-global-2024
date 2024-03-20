import java.util.Scanner;

public class ReadingAndPrinting {

    public static void main(String[] args) {
        
        String name;

        Scanner scan = new Scanner(System.in);

        System.out.print("Hello Sir/Mam, please enter your name : ");

        name = scan.nextLine();

        System.out.println("Hello " + name);


    }
    
}