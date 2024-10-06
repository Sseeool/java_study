package operator;

public class Comp1 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a <= b);

        // 결과를 boolean 변수에 담을 수 있음
        boolean result = a == b;
        System.out.println(result); // false
    }
}

/*
 비교 연산자
 == equal to
 != not equal to
 ! 반대

 비교 연산자를 사용하면 true false 결과가 나옴 (boolean)

 */