package cond;

import java.util.Scanner;

public class If1 {
    public static void main(String[] args) {
        int age;

        System.out.print("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        if (age >= 18) {
            System.out.println("Adult");
        }
        else { // if (age < 18) 과 같음
            System.out.println("Minor");
        }
    }
}
