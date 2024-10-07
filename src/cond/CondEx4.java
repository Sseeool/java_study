package cond;

import java.util.Scanner;

public class CondEx4 {
    public static void main(String[] args) {
        System.out.print("I'll find movies with rating higher than you request. Please enter the rating: ");
        Scanner sc = new Scanner(System.in);
        double rating = sc.nextDouble();

        if (rating <= 9)
            System.out.println("About Time");
        if (rating <= 8)
            System.out.println("Toy Story");
        if (rating <= 7)
            System.out.println("Gozilla");
    }
}
