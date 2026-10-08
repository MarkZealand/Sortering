import java.io.IOException;
import java.util.Scanner;

void main() throws IOException {
    Scanner input = new Scanner(System.in);
    System.out.print("Vælg opgavens nummer: ");
    int choice = input.nextInt();

    switch(choice) {
        case 1:
            //BUBBLE
            OpgaveEt.Run(input);
            break;
        case 2:
            OpgaveTo.Run(input);
            break;
        case 3:
            //BUBBLE
            OpgaveTre.Run(input);
            break;
        case 4:
            //INSERTION
            OpgaveFire.Run(input);
            break;
        case 5:
            //SELECTION SORT
            OpgaveFem.Run(input);
            break;
        case 6:
            //SHELL SORT
            OpgaveSeks.Run(input);
            break;
        case 7:
            OpgaveSyv.Run(input);
            break;
        case 8:
            OpgaveOtte.Run(input);
            break;
        case 9:
            OpgaveNi.Run(input);
            break;
        case 10:
            OpgaveTi.Run(input);
            break;
        default:
            System.out.println("Ugyldigt valg. Vælg et nummer mellem 1 og 10.");
    }
}