import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.NumberFormat;
import java.util.List;

public class Human {
    public static void main(String[] args) {
        try {
            List<String> list = Files.readAllLines(Paths.get("Readme.mdx"));
            System.out.println(list);
        }catch (FileNotFoundException ex) {
            System.out.println("File doesn't exist");
        }catch (Exception ex){
            System.out.println("File not foound: "+ ex.getMessage());
        }
    }
}
