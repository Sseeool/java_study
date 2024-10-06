package operator;

import java.util.Scanner;

public class OperationEx3 {
    public static void main(String[] args) {
        int score;

        // scanner 을 통해 점수 입력받기
        System.out.println("Please enter your score: ");
        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();

        // 범위에 따를 boolean 출력
        boolean result;
        result = 80 <= score && score <= 100;
        System.out.println(result);
    }
}
