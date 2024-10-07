package cond;

import java.util.Scanner;

public class CondEx3 {
    public static void main(String[] args) {
        int won;

        System.out.print("How much would you like to exchange?(unit is dollar): ");
        Scanner sc = new Scanner(System.in);
        int dollar = sc.nextInt();

        if (dollar < 0) {
            System.out.println("The amount is incorrect.");
            return;
        }
        else if (dollar == 0) {
            System.out.println("No dollars to exchange.");
            return;
        }
        won = dollar * 1300;
        System.out.println("The exchange amount is "+ won);
    }
}
