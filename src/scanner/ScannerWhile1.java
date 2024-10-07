package scanner;

import java.util.Scanner;

public class ScannerWhile1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a String: ");
            String str = scanner.nextLine();
            if (str.equals("exit")) {
                break;
            }
            System.out.println("Enetered String: " + str);
        }
        System.out.println("The program is closing.");
    }
}
