import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//SELECTION SORT

public class SelectionSort {
    public static void Run(Scanner input) throws IOException {

        List<String> lines = Files.readAllLines(Paths.get("100.txt"));
        List<Integer> numre = new ArrayList<>();

        for (String line : lines) {
            for (String value : line.split(",")) {
                numre.add(Integer.parseInt(value.trim()));
            }
        }

        int lineLength = numre.size();

        //SELECTION SORT- FINDER MINDSTE VÆRDI I HVERT LOOP OG ARRANGER.
        for (int i = 0; i < lineLength - 1; i++) {
            int minIndex = i;
            for (int j = i+1; j < lineLength; j++) {
                if(numre.get(j) < numre.get(minIndex)){
                    minIndex = j;
                }
            }
            if(minIndex != i){
                int tempVal =  numre.get(i);
                numre.set(i, numre.get(minIndex));
                numre.set(minIndex, tempVal);
            }
        }

        for (Integer number : numre){
            System.out.println(number);
        }
    }
}


/*
procedure SelectionSort(array)
    n = længden af array

    for i = 0 til n - 2 gør
        minIndex = i

        for j = i + 1 til n - 1 gør
            hvis array[j] < array[minIndex] så
                minIndex = j
            slut hvis
        slut for

        hvis minIndex ≠ i så
            bytte array[i] og array[minIndex]
        slut hvis
    slut for
slut procedure
 */