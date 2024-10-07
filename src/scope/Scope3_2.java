package scope;

import java.util.Scanner;

public class Scope3_2 {
    public static void main(String[] args) {
        System.out.print("Please enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number > 0) {
            int tmp = number * 2;
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

/*
    변수의 스코프 관점에서 while 문과 for 문
    - while 문의 경우 변수 i 스코프가 main() 메서드 전체가 됨
    - for 문의 경우 변수 i 스코프가 for 문 안으로 한정됨
    -> 변수 i 와 같이 for 문 안에서만 사용되는 카운터 변수가 있다면 while 문보다는 for 문을 사용하여
        스코프의 범위를 제한하는 것이 메모리 사용과 유지보수 관점에서 더 좋음
 */
