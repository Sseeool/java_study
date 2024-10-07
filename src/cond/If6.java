package cond;

import java.util.Scanner;

public class If6 {
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
        else if (age <= 10) {
            discount += 1000;
        }

        System.out.println("The total discount amount is " + discount);

        // if (true) System.out.println("execute in conditional sentence");
    }
}

/*
 if 문 블럭 안에 있는게 한 줄일 때 if 문과 붙여서 한 줄로 사용 가능

 중괄호를 사용하면 좋은 점
 1. 가독성
 2. 유지보수성
 */
