import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


//SHELL SORT
public class ShellSort {
    public static void Run(List<Integer> numre) throws IOException {

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

/*
    procedure ShellSort(array)
    n = længden af array

    // Start med et stort gap og reducer det gradvist
    gap = n / 2

    while gap > 0 do
        // Udfør en gap-sortering for det aktuelle gap
        for i = gap to n - 1 do
            temp = array[i]
            j = i

            // Flyt elementer af arrayet, der er gap pladser bagud
            while j >= gap and array[j - gap] > temp do
                array[j] = array[j - gap]
                j = j - gap
            end while

            // Placer temp på sin korrekte position
            array[j] = temp
        end for

        // Reducer gap for næste iteration
        gap = gap / 2
    end while
 */