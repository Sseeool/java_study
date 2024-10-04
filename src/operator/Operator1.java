package operator;

public class Operator1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        // 덧셈
        int sum = a + b;
        System.out.println("a + b = " + sum); // 출력 a + b = 8

        // 뺄셈
        int diff = a - b;
        System.out.println("a - b = " + diff);

        // 곱셈
        int multi = a * b;
        System.out.println("a * b = " + multi);

        // 나눗셈
        int div = a / b;
        System.out.println("a / b = " + div);

        // 나머지
        int mod = a % b;
        System.out.println("a % b = " + mod);

        // 주의 ! 0으로 나누기.
        // 숫자를 0으로 나누는 것은 수학에서 허용하지 않음.
        // -> 프로그램에 오류 발생
//        int z = 10 /0
    }
}

/*
int sum = a + b 계산과정
1. 변수 값 읽기
2. 변수 값 계산
3. 계산 결과를 sum에 대입
4. 최종 결과
 */

/*
주의 ! 0으로 나누기
 */