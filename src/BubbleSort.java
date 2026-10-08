import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;


//BUBBLE SORT

public class BubbleSort {
    public static void Run(Scanner input) throws IOException {
        File smallWordList = new File("100.txt");

        List<String> lines = Files.readAllLines(Paths.get("100.txt"));
        List<Integer> numbers = new ArrayList<>();

        for (String line : lines) {
            for (String value : line.split(",")) {
                numbers.add(Integer.parseInt(value.trim()));
            }
        }

        int loopsLeft = numbers.size();
        boolean swapped = true;
        for (int x = 0; x < numbers.size() - 1; x++) {
            swapped = false;

            for (int i = 0; i < loopsLeft - 1; i++) {

                if (numbers.get(i) > numbers.get(i + 1)) {
                    int temp = numbers.get(i);
                    numbers.set(i, numbers.get(i + 1));
                    numbers.set(i + 1, temp);
                    swapped = true;
                }

            }
            loopsLeft--;
            if (!swapped) {break;}
        }
        for (Integer number : numbers){
            System.out.println(number);
        }
    }
}
