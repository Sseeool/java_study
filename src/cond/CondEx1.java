package cond;

import java.util.Scanner;

public class CondEx1 {
    public static void main(String[] args) {
        char grade;

        System.out.print("Enter your grade: ");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        if (score >= 90)
            grade = 'A';
        else if (score >= 80)
            grade = 'B';
        else if (score >= 70)
            grade = 'C';
        else if (score >= 60)
            grade = 'D';
        else
            grade = 'F';

        System.out.println("Your grade is " + grade);
    }
}
