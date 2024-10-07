package scanner;

import java.util.Scanner;

public class ScannerWhile2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("If both the first number and the second number are entered as 0, the program will terminate. ");
        while (true) {
            System.out.print("Enter the first number: ");
            int firstNumber = scanner.nextInt();
            System.out.print("Enter the second number: ");
            int secondNumber = scanner.nextInt();

            if (firstNumber == 0 && secondNumber == 0) {
                System.out.println("The program is closing.");
                break;
            }

            int sum = firstNumber + secondNumber;
            System.out.println("The sum of the first number is: " + sum);
        }
    }
}
