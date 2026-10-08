import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class QuickSort {

    public static void Run(List<Integer> numbers) throws IOException {


        long startTime = System.nanoTime();
        QuickSorter(numbers,0, numbers.size() -1);
        long endTime = System.nanoTime();

        for (Integer number : numbers){
            System.out.println(number);
        }

        System.out.println("Duration: " + TimeUnit.NANOSECONDS.toMillis(endTime - startTime) + "ms");
    }



    public static void QuickSorter(List<Integer> numbers, int low, int high) {
        if(low < high){
            int pivotIndex = Partition(numbers, low, high);
            QuickSorter(numbers, low, pivotIndex - 1);
            QuickSorter(numbers,pivotIndex + 1, high);
        }
    }

    public static int Partition(List<Integer> numbers, int low, int high) {
        int  pivot = numbers.get(high);
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (numbers.get(j) <= pivot) {
                i++;
                Swap(numbers, i,j);
            }
        }
        Swap(numbers,i+1, high);
        return i+1;
    }

    public static void Swap(List<Integer> numbers, int a, int b) {
        int temp = numbers.get(a);
        numbers.set(a, numbers.get(b));
        numbers.set(b, temp);
    }
}

/*
procedure QuickSort(array, low, high)
if low < high then
        // Find pivot-elementets korrekte position i det sorterede array
        pivotIndex = Partition(array, low, high)
        // Rekursivt sorter elementerne før og efter pivot
        QuickSort(array, low, pivotIndex - 1)
        QuickSort(array, pivotIndex + 1, high)
end if


// Partition-funktionen opdeler arrayet og returnerer det korrekte pivot-index
procedure Partition(array, low, high)
    pivot = array[high]  // Vælg det sidste element som pivot
    i = low - 1          // Index for det mindre element
    for j = low to high - 1 do
        if array[j] <= pivot then
            i = i + 1
            Swap(array[i], array[j])  // Byt array[i] og array[j]
        end if
    end for
    // Byt pivot til sin korrekte position
    Swap(array[i + 1], array[high])
    return i + 1  // Returner pivot-elementets indeks


// Swap-funktion bytter to elementer i arrayet
procedure Swap(a, b)
    temp = a
    a = b
    b = temp

 */