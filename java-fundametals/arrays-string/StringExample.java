
public class StringExample {
    
    public static void main(String[] args) {
        
        String str = "Hello World";

        StringBuilder sb = new StringBuilder(str);

        

        sb.setCharAt(6, 'w');

       // str = str + ", Have fun";

        // str = "Hello UST";

        int count = str.length();

        int position = str.indexOf("W");

        char ch = str.charAt(4);

        System.out.println(sb);
        System.out.println("Length : "+count);
        System.out.println("Position : "+position);
        System.out.println(ch);

    }

}
