import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


//INSERTION SORT
public class InsertionSort {
    public static void Run(Scanner input) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("worstcase.txt"));
        List<Integer> numre = new ArrayList<>();

        for (String line : lines) {
            for (String value : line.split(",")) {
                numre.add(Integer.parseInt(value.trim()));
            }
        }
        long startTime = System.nanoTime();
        int arrayLength = numre.size();
        for (int i = 1; i < arrayLength; i++) {
            int currentIndex = numre.get(i);
            int previousIndex = i - 1;
            while(previousIndex >= 0 && numre.get(previousIndex) > currentIndex){
                numre.set(previousIndex+1,numre.get(previousIndex));
                previousIndex--;
            }
            numre.set(previousIndex+1, currentIndex);
        }

        long endTime = System.nanoTime();
        long durationInMillis = TimeUnit.NANOSECONDS.toMillis(endTime - startTime);
        System.out.println("Duration: " + durationInMillis + "ms");
    }
}
