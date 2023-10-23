package homework_week_7;

import java.util.Scanner;

/**
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO”
 */

public class Programme16_FindPositiveNegative {
    public static void main(String[] args) {

        // Creating scanner
        Scanner scanner = new Scanner(System.in);

        //Closing scanner
        scanner.close();

        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        if (number > 0) {
            System.out.println("POSITIVE");
        } else if (number < 0) {
            System.out.println("NEGATIVE");
        } else {
            System.out.println("ZERO");
        }
    }
}
