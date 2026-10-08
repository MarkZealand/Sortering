import java.io.IOException;
import java.util.Scanner;

void main() throws IOException {
    Scanner input = new Scanner(System.in);
    System.out.println("===Vælg sorteringsmetode===");
    System.out.println("1. BubbleSort");
    System.out.println("2. InsertionSort");
    System.out.println("3. SelectionSort");
    System.out.println("4. ShellSort");
    System.out.println("5. QuickSort");
    System.out.print("Indtast 1-5: ");
    int choice = input.nextInt();

    switch(choice) {
        case 1:
            //BUBBLE
            BubbleSort.Run(input);
            break;
        case 2:
            //INSERTION
            InsertionSort.Run(input);
            break;
        case 3:
            //SELECTION SORT
            SelectionSort.Run(input);
            break;
        case 4:
            //SHELL SORT
            ShellSort.Run(input);
            break;
        case 5:
            QuickSort.Run(input);
            break;
        default:
            System.out.println("Ugyldigt valg. Vælg et nummer mellem 1 og 5.");
    }
}