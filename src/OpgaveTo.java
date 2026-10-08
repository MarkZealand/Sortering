import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;


public class OpgaveTo {
    public static void Run(Scanner input) throws IOException {
        File smallWordList = new File("100.txt");

        List<String> lines = Files.readAllLines(Paths.get("100.txt"));
        List<Integer> numbers = new ArrayList<>();

        for (String line : lines) {
            for (String value : line.split(",")) {
                numbers.add(Integer.parseInt(value.trim()));
            }
        }



        for (Integer number : numbers){
            System.out.println(number);
        }
    }
}
