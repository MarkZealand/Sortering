import java.io.IOException;
import java.util.Scanner;

void main() throws IOException {
    //REFERENCES
    Scanner input = new Scanner(System.in);
    String fileName = showFileMenu(input);
    List<String> lines = Files.readAllLines(Paths.get(fileName));
    List<Integer> numbers = new ArrayList<>();
    createArray(lines, numbers);

    showSortMenu(input, numbers);
}

private static String showFileMenu(Scanner input) {
    System.out.println("===Vælg datasæt===");
    System.out.println("1. 100.txt");
    System.out.println("2. 1000.txt");
    System.out.println("3. 10000.txt");
    System.out.println("4. worstcase.txt");
    System.out.println("5. semisorted.txt");
    System.out.print("Indtast 1-5: ");

    int choice = input.nextInt();

    return loadFile(choice);
}

private static String loadFile(int choice) {
    switch(choice) {
        case 1:
            return "100.txt";
        case 2:
            return "1000.txt";
        case 3:
            return "10000.txt";
        case 4:
            return "worstcase.txt";
        case 5:
            return "semisorted.txt";
        default:
            System.out.println("Ugyldigt valg. Vælger worstcase.txt.");
            return "worstcase.txt";
    }
}

private static void createArray(List<String> lines, List<Integer> numbers) {
    for (String line : lines) {
        for (String value : line.split(",")) {
            numbers.add(Integer.parseInt(value.trim()));
        }
    }
}

private static void showSortMenu(Scanner input, List<Integer> numbers) throws IOException {
    System.out.println("===Vælg sorteringsmetode===");
    System.out.println("1. BubbleSort");
    System.out.println("2. InsertionSort");
    System.out.println("3. SelectionSort");
    System.out.println("4. ShellSort");
    System.out.println("5. QuickSort");
    System.out.print("Indtast 1-5: ");
    int choice = input.nextInt();
    loadSorting(choice, numbers);
}


private static void loadSorting(int choice, List<Integer> numbers) throws IOException {
    switch(choice) {
        case 1:
            //BUBBLE
            BubbleSort.Run(numbers);
            break;
        case 2:
            //INSERTION
            InsertionSort.Run(numbers);
            break;
        case 3:
            //SELECTION SORT
            SelectionSort.Run(numbers);
            break;
        case 4:
            //SHELL SORT
            ShellSort.Run(numbers);
            break;
        case 5:
            QuickSort.Run(numbers);
            break;
        default:
            System.out.println("Ugyldigt valg. Vælg et nummer mellem 1 og 5.");
    }
}
