package scanner;

import java.util.Scanner;

public class ScannerWhile3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        while (true) {
            System.out.print("Enter a Integer: ");
            int num = scanner.nextInt();

            if (num == 0) {
                break;
            }

            sum += num;
        }

        System.out.println("Sum: " + sum);
    }
}
