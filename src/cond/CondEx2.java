package cond;

import java.util.Scanner;

public class CondEx2 {
    public static void main(String[] args) {
        String transportation;

        System.out.print("Please enter the distance(unit is kilometer): ");
        Scanner sc = new Scanner(System.in);
        int distance = sc.nextInt();

        if (distance <= 1)
            transportation = "walk";
        else if (distance <= 10)
            transportation = "bike";
        else if (distance <= 100)
            transportation = "car";
        else
            transportation = "plane";

        System.out.println("Use " + transportation);
    }
}
