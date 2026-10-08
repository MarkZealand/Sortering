import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


//INSERTION SORT
public class InsertionSort {
    public static void Run(List<Integer> numre) throws IOException {

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

/*
procedure InsertionSort(array)
    n = længden af array

    for i = 1 til n - 1 gør
        nuværendeElement = array[i]
        j = i - 1

        mens j >= 0 og array[j] > nuværendeElement gør
            array[j + 1] = array[j]
            j = j - 1
        slut mens

        array[j + 1] = nuværendeElement
    slut for
slut procedure
 */