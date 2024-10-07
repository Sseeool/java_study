package scope;

public class Scope1 {
    public static void main(String[] args) {
        int m = 10; // m 생존 시작

        if (true) {
            int x = 20; // x 생존 시작
            System.out.println("if m = " + m);
            System.out.println("if x = " + x);
        } // x 생존 종료
//        System.out.println("main x = " + x);
        System.out.println("main m = " + m);
    } // m 생존 종료
}

/*
    변수는 선언한 위치에 따라 지역변수, 멤버 변수(클래스 변수, 인스턴스 변수)와 같이 분류된다.

    지역 변수는 특정 지역에서만 사용할 수 있는 변수.
    특정 지역은 변수가 선언된 코드 블록 {}임.
    지역 변수는 자신이 선언된 코드블록 안에서만 생존하고, 자신이 선언된 블록을 벗어나면 제거됨.
 */

/*
    Scope: 변수의 접근 가능한 범위.
 */