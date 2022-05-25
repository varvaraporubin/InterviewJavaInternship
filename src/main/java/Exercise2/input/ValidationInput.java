package Exercise2.input;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ValidationInput {

    Scanner scanner;

    public ValidationInput() {
        scanner = new Scanner(System.in);
    }

    public int inputInt() throws InputMismatchException {
        int intInput = scanner.nextInt();
        while (intInput < 0) {
            System.out.println("The input should not be <0");
            intInput = scanner.nextInt();
        }
        scanner.nextLine();
        return intInput;
    }

    public String inputString() {
        return scanner.nextLine();
    }

    public void closeScanner() {
        this.scanner.close();
    }
}
