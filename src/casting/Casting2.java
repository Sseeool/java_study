package casting;

public class Casting2 {
    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

//        intValue = doubleValue; 컴파일 오류 발생
        intValue = (int)doubleValue;
        System.out.println("intValue = " + intValue);

        doubleValue = 10.5;
        int z = (int)doubleValue;
        System.out.println((int)z);
    }
}

/*
    큰 것에서 작은 것으로 바꾸려하니 손실 발생할 수 있음

    명시적 형변환
    손실 발생 감수하고도 대입하고 싶다면 데이터 타입을 강제로 변경할 수 있음
    데이터 타입을 (int)와 같이 괄호를 사용해서 명시적으로 입력하면 됨

    캐스팅 용어
    금속이나 다른 물질을 녹여서 특정한 형태나 모양으로 만드는 과정

    명시적 형변환 과정
    intValue = (int)doubleValue;
    intValue = (int)1.5; // doubleValue에 있는 값 읽기
    intValue = 1; // (int) 로 형변환. intValue 에 int 형인 숫자 1 대입

    * doubleValue 의 값 자체를 바꾸는 것은 아님. 읽은 값을 형변환.
 */
