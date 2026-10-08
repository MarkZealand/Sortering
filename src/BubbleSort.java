import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;


//BUBBLE SORT

public class BubbleSort {
    public static void Run(List<Integer> numbers) throws IOException {

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

/*
 procedure BubbleSort(array)
    n = længden af array
    repeat
        swapped = false
        for i = 0 to n - 2 do
            if array[i] > array[i + 1] then
                bytte array[i] og array[i + 1]
                swapped = true
            end if
        end for
        n = n - 1
    until not swapped
end procedure
 */