package operator;

public class Operator4 {
    public static void main(String[] args) {
        int sum3 = 2 * 2 + 3 * 3; // (2 * 2) + (3 * 3)
        int sum4 = (2 * 2) + (3 * 3);
        System.out.println("sum3 = " + sum3);
        System.out.println("sum4 = " + sum4);
    }
}

/*
 복잡한 경우 괄호를 넣어서 명시적으로 표시해주자.
 코드를 좀 더 쓰더라도 명확하고 단순한 것이 더 유지보수 하기 좋다.
 연산자 우선순위가 애매하거나 조금이라도 복잡하다면 괄호를 넣어주자.
 */

/*
 연산자 우선순위 암기법
 1. 괄호
 2. 단항 연산자 (++, --, !, ~, new, (type))
 3. 산술 연산자
 4. shift 연산자
 5. 비교 연산자
 6. 등식 연산자
 7. 비트 연산자
 8. 논리 연산자
 9. 삼항 연산자
 10. 대입 연산자

 상식 선에서 우선순위를 사용하자.
 애매하면 괄호를 사용하자.
 */