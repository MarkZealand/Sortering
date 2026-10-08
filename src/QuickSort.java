import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class QuickSort {

    public static void Run(Scanner input) throws IOException {

        List<String> lines = Files.readAllLines(Paths.get("worstcase.txt"));
        List<Integer> numbers = new ArrayList<>();
        createArray(lines, numbers);

        long startTime = System.nanoTime();
        QuickSorter(numbers,0, numbers.size() -1);
        long endTime = System.nanoTime();

        for (Integer number : numbers){
            System.out.println(number);
        }

        System.out.println("Duration: " + TimeUnit.NANOSECONDS.toMillis(endTime - startTime) + "ms");
    }

    private static void createArray(List<String> lines, List<Integer> numbers) {
        for (String line : lines) {
            for (String value : line.split(",")) {
                numbers.add(Integer.parseInt(value.trim()));
            }
        }
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
