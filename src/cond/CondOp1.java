package cond;

import java.util.Scanner;

public class CondOp1 {
    public static void main(String[] args) {
        String status;

        System.out.print("Please enter your age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age >= 18)
            status = "adult";
        else
            status = "minor";
        System.out.println("age = " + age + ", status = " + status);
    }
}
