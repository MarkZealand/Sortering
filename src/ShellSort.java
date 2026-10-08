import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


//SHELL SORT
public class ShellSort {
    public static void Run(Scanner input) throws IOException {

        List<String> lines = Files.readAllLines(Paths.get("100.txt"));
        List<Integer> numre = new ArrayList<>();

        for (String line : lines) {
            for (String value : line.split(",")) {
                numre.add(Integer.parseInt(value.trim()));
            }
        }

        int gap = numre.size() / 2;

        while(gap > 0){
            for (int i = 0; i < numre.size(); i++) {
                int temp = numre.get(i);
                int j = i;
                while(j >= gap && numre.get(j-gap) > temp)
                {
                    numre.set(j, numre.get(j-gap));
                    j = j  - gap;
                }
                numre.set(j,temp);
            }
            gap = gap / 2;
        }
        for (Integer number : numre){
            System.out.println(number);
        }
    }
}
