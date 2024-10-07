package cond;

import java.util.Scanner;

public class CondEx5 {
    public static void main(String[] args) {
        System.out.print("Please enter your grade: ");
        Scanner sc = new Scanner(System.in);
        String grade = sc.nextLine();

        String achievement = switch (grade) {
            case "A" -> "Perfect";
            case "B" -> "Good";
            case "C" -> "So so";
            default -> "Wrong grade";
        };
        System.out.println(achievement);
    }
}
