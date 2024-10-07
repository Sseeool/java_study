package cond;

import java.util.Scanner;

public class CondEx6 {
    public static void main(String[] args) {
        System.out.print("Enter a first number: ");
        Scanner sc1 = new Scanner(System.in);
        int a = sc1.nextInt();

        System.out.print("Enter a second number: ");
        Scanner sc2 = new Scanner(System.in);
        int b = sc2.nextInt();

        int result = (a > b) ? a : b;
        // int result = Math.max(a, b);
        System.out.println(result);
    }
}
