import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatch {

    public static void main(String[] args) {
        Scanner scan = null;
        int num1, num2, result;
        System.out.println("Input value for num1 and num2");
        try{
            num1 = scan.nextInt();
            num2 = scan.nextInt();
            result = num1/num2;
            System.out.println("Result of division : "+result);
        }

        catch (InputMismatchException ex){
            System.out.println("Invalid input");
        }
        catch (ArithmeticException ex){
            System.out.println("Can not divide by zero");
        }
        catch (RuntimeException ex){

        }
        catch (Exception ex){
            System.out.println(ex);
        }


    }
}
