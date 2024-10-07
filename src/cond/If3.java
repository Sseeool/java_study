package cond;

import java.util.Scanner;

public class If3 {
    public static void main(String[] args) {
        int age;

        System.out.print("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        if (age <= 7) {
            System.out.println("preschool child");
        }
        else if (age <= 13) {
            System.out.println("elementary school student");
        }
        else if (age <= 16) {
            System.out.println("middle school student");
        }
        else if (age <= 19) {
            System.out.println("high school student");
        }
        else {
            System.out.println("adult");
        }
    }
}

/*
 else if: 순서대로 조건 검사하고 조건이 맞으면 실행
 */