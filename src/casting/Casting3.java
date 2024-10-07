package casting;

public class Casting3 {
    public static void main(String[] args) {
        long maxIntValue = 2147482647; // int 최고값
        long maxIntOver = 2147483648L; // int 최고값 + 1
        int intValue = 0;

        intValue = (int)maxIntValue;
        System.out.println("maxIntValue casting = " + intValue);

        intValue = (int)maxIntOver;
        System.out.println("maxIntOver casting = " + intValue);
    }
}

/*
    형변환과 오버플로우
    형변환을 할 때 작은 숫자가 표현할 수 있는 범위를 넘어서면 어떻게 될까?
    오버플로우가 난다 ..
 */
