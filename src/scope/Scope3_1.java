package scope;

import java.util.Scanner;

public class Scope3_1 {
    public static void main(String[] args) {
        System.out.print("Please enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int tmp = 0;
        if (number > 0) {
            tmp = number * 2;
            System.out.println("multipled by 2 result: " + tmp);
        }
        System.out.println("origin number: " + number);
    }
}

/*
    1. 비효율적인 메모리 사용
    임시변수 tmp는 if 문이 참일 때만 필요한데, if 코드블럭 밖에서 선언함으로써 메모리가 비효율적으로 사용된다.

    2. 코드 복잡성 증가
    if 코드 블럭이 끝났을 때 tmp 에 대해 생각하지 않아도 되는데, 이건 복잡함
 */
