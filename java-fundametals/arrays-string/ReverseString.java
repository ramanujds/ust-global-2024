import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.next();
        StringBuilder rev = new StringBuilder();
        int length = str.length();
        for(int i=length-1;i>=0;i--){
                rev.append(str.charAt(i)); 
        }
        
        if(str.equalsIgnoreCase(rev.toString())){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }

    }

}
