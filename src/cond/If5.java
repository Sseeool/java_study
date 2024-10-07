package cond;

import java.util.Scanner;

public class If5 {
    public static void main(String[] args) {
        int total_fee;
        int age;
        int discount = 0;

        System.out.print("Please enter your total shopping amount: ");
        Scanner sc = new Scanner(System.in);
        total_fee = sc.nextInt();

        System.out.print("Please enter your age: ");
        Scanner sc2 = new Scanner(System.in);
        age = sc2.nextInt();

        if (total_fee >= 10000) {
            discount += 1000;
        }
        if (age <= 10) {
            discount += 1000;
        }

        System.out.println("The total discount amount is " + discount);
    }
}

/*
 조건이 독립적으로 수행되어야 하는 경우 if 문을 분리해서 사용
 */