package loop;

import java.util.Scanner;

public class LoopEx5 {
    public static void main(String[] args) {
        int sum = 0;

        System.out.print("Please enter max number: ");
        Scanner scanner = new Scanner(System.in);
        int max = scanner.nextInt();

        for (int i = 0; i <= max; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
