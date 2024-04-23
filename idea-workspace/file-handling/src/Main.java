import java.io.*;

public class Main {
    public static void main(String[] args) {
//        try {
//            FileInputStream inputStream = new FileInputStream("data.txt");
//            int ch;
//            while ((ch=inputStream.read())!=-1){
//                System.out.print((char)ch);
//            }
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        try {
            FileOutputStream outputStream = new FileOutputStream("output.txt");
            String str = """
                    Hello everyone
                    How are you?
                    Are you suffering from Summer?
                    """;

            char []chars = str.toCharArray();

            for (char ch : chars){
                outputStream.write((int)ch);
            }
            outputStream.close();

        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }

    }
}