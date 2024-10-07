package loop;

import java.util.Scanner;

public class LoopEx6 {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;

        System.out.print("Please enter max number: ");
        Scanner scanner = new Scanner(System.in);
        int max = scanner.nextInt();

        while (i <= max) {
            sum += i++;
        }
        System.out.println(sum);
    }
}
