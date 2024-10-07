package scanner;

import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("First number: ");
        int a = scanner.nextInt();
        System.out.print("Second number: ");
        int b = scanner.nextInt();
        System.out.println(a + b);
    }
}
