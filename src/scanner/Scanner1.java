package scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = scanner.nextLine(); // 입력을 String 으로 가져온다
        System.out.println("Entered String: " + str);

        System.out.print("Enter a Integer: ");
        int intValue = scanner.nextInt();
        System.out.println("Entered Integer: " + intValue);

        System.out.print("Enter a double: ");
        double doubleValue = scanner.nextDouble();
        System.out.println("Entered Double: " + doubleValue);
    }
}

/*
    Scanner
    사용자 입력받기
    new 를 이용해서 Scanner 을 만든다
    타입이 다를 시 오류 발생
 */
