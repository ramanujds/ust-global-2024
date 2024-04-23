import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Hello world! Enter a number : ");
//        String str = null;
//        if(str!=null) {
//            int length = str.length();
//            System.out.println(length);
//        }

        int num = 0;
        String number = scan.next();
        try {
            num = Integer.parseInt(number);
        }
        catch (NumberFormatException ex){
            System.out.println(ex.getMessage());
        }

        System.out.println(num);
//        try {
//            scan = new Scanner(new FileReader("data.txt"));
//        }
//        catch (FileNotFoundException ex){
//            System.out.println(ex.getMessage());
//        }


        System.out.println("How are you feeling today?");
        String feelings = scan.next()+scan.nextLine();
        System.out.println("Hello glad to know that you are feeling "+feelings);
        System.out.println("Bye...");
    }
}