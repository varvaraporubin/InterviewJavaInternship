package Exercise1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class BirthdayCakeCandles {
    public static void main(String[] args) throws InputMismatchException {
        System.out.println("---Birthday Cake Candles---");

        Scanner scanner = new Scanner(System.in);

        int numberOfCandles = scanner.nextInt();
        List<Integer> candles = new ArrayList<>(numberOfCandles);

        int maxHeight = Integer.MIN_VALUE;
        int count = 0;

        for (int i = 0; i < numberOfCandles; i++) {
            int heightOfCandles = scanner.nextInt();
            if (heightOfCandles > maxHeight) {
                maxHeight = heightOfCandles;
                count = 1;
            } else if (maxHeight == heightOfCandles) {
                count++;
            }
        }
        System.out.println(count);
    }
}
