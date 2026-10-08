import java.util.Scanner;



//INSERTION SORT
public class OpgaveTre {
    public static void Run(Scanner input) {

        int[] numre = {45,3,26,57768,545,534,24,5,34,56,567,45,34,46,456,34,234,76,679,0,323};

        int arrayLength = numre.length;
        for (int i = 1; i < arrayLength; i++) {
            int currentIndex = numre[i];
            int previousIndex = i - 1;
            while(previousIndex >= 0 && numre[previousIndex] > currentIndex){
                numre[previousIndex+1] = numre[previousIndex];
                previousIndex--;
            }
            numre[previousIndex+1] = currentIndex;
        }

        for (Integer num : numre){
            System.out.println(num);
        }
    }
}
