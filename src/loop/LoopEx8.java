package loop;

import java.util.Scanner;

public class LoopEx8 {
    public static void main(String[] args) {
        System.out.print("How many rows do you need?: ");
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
