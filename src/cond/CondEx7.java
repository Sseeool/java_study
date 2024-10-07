package cond;

import java.util.Scanner;

public class CondEx7 {
    public static void main(String[] args) {
        System.out.print("Please enter a number: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        String evenOrOdd = (x % 2 == 0) ? "even number" : "Odd number";
        System.out.println(evenOrOdd);
    }
}
