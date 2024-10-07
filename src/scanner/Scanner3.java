package scanner;

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("First number: ");
        int a = scanner.nextInt();
        System.out.print("Second number: ");
        int b = scanner.nextInt();

        if (a == b)
            System.out.println("Two numbers are equal");
        else {
            int max = Math.max(a, b);
            System.out.println(max + " is larger one");
        }
    }
}
