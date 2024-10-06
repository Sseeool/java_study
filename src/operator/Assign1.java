package operator;

public class Assign1 {
    public static void main(String[] args) {
        int a = 5;
        a += 3; // 8
        a -= 2; // 6
        a *= 4; // 24
        a /= 3; // 8
        a %= 5; // 3
        System.out.println(a);

    }
}

/*
 대입 연산자 =
 값을 변수에 할당하는 연산자

 축약(복합) 대입 연산자
 종류: +=, -=, *=, /=, %=
 */
