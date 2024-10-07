package cond;

import java.util.Scanner;

public class Switch3 {
    public static void main(String[] args) {
        int grade;

        System.out.print("Please enter your grade: ");
        Scanner sc = new Scanner(System.in);
        grade = sc.nextInt();

        int coupon = switch (grade) {
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
        };
        System.out.println("Your coupon is " + coupon);
    }
}
