import java.io.*;

public class FileWithCharacterStream {

    public static void main(String[] args) {


        File file = new File("ust.txt");

        try {
//            FileReader reader = new FileReader(file);
//            BufferedReader bufferedReader = new BufferedReader(reader);
////            String str = bufferedReader.readLine();
////            while (str!=null){
////                System.out.println(str);
////                str = bufferedReader.readLine();
////            }
//
//            bufferedReader.lines().forEach(line-> System.out.println(line));


        FileWriter writer = new FileWriter(file,true);
            String str = """
                    You can visit beaches nearby
                    """;

            writer.append(str);
            writer.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}
