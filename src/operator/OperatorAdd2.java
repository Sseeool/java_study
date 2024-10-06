package operator;

public class OperatorAdd2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        // 전위 증감 연산자 사용 예
        b = ++a; // a 의 값을 먼저 증가시키고, 그 결과를 b 에 대입
        System.out.println("a = " + a + ", b = " + b);

        // 후위 증감 연산자 사용 예
        a = 1; // a의 값을 다시 1로 지정
        b = 0; // b의 값을 다시 0으로 지정
        b = a++; // a 의 현재 값을 b에 먼저 대입하고, 그 후 a 값을 증가시킴
        System.out.println("a = " + a + ", b = " + b);
    }
}

/*
 전위, 후위 증감 연산자
 피연산자 앞에 두거나 뒤에 둘 수 있으며, 연산자의 위치에 따라 연산이 수행되는 시점이 달라짐

 단독으로 사용하는 경우에는 다른 연산이 없기 ㄸ문에 본인의 값만 증가하여 전위든 후위이든 결과가 같음
 ++a;
 a++;
 */
