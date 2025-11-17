import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Services {

    public static void  displayFile(){

        Path path = Paths.get("src/downloads/myfile.txt");

        try {

            List<String> lines = Files.readAllLines(path);
            for (String line : lines) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }


    public static void saveToFile(List<String> newLines) {
        Path path = Paths.get("src/reasources/myfile.txt");
        List<String> lines = List.of();
        try {

            lines = Files.readAllLines(path);
            for (String line : newLines) {
                lines.add(line);
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {

            Files.write(path, lines);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());


        }

    }
}