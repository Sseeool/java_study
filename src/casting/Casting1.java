package casting;

public class Casting1 {
    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue;
        System.out.println("longValue = " + longValue);

        doubleValue = intValue;
        System.out.println("doubleValue = " + doubleValue);

        doubleValue = 20L;
        System.out.println("doubleValue = " + doubleValue);
    }
}

/*
    형변환
    - 작은 범위에서 큰 범위로는 당연히 값을 넣을 수 있다.
        int -> long -> double
    - 큰 범위에서 작은 범위는 다음과 같은 문제가 발생할 수 있음
        - 소수점 버림
        - 오버플로우
 */

/*
    자동 형변환, 묵시적 형변환
    intValue = 10;
    doubleValue = (double)intValue // 형 맞추기
    doubleValue = (double)10 // 변수 값 읽기
    doubleValue = 10.0 // 형변환
 */
