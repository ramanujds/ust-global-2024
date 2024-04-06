import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReadingWithNIO {
    public static void main(String[] args) throws IOException {

        Files.lines(Paths.get("data.txt"))
                .forEach(str-> System.out.println(str));



    }
}
