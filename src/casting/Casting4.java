package casting;

public class Casting4 {
    public static void main(String[] args) {
        int div1 = 3 / 2;
        System.out.println("div1 = " + div1); // 1 int / int

        double div2 = 3 / 2; // 1.0
        System.out.println("div2 = " + div2); // 1.0

        double div3 = 3.0 / 2;
        System.out.println("div3 = " + div3); // 1.5. int -> double 로 형변환 발생 후 double / double 계산

        double div4 = (double) 3 / 2; // 명시적 형변환을 했으므로 (double)int / int -> double / double
        System.out.println("div4 = " + div4); // 1.5

        int a = 3;
        int b = 2;
        double result = (double) a/ b;
        System.out.println("result = " + result); // 1.5
    }
}

/*
    1. 같은 타입끼리의 계산은 같은 타입의 결과
    2. 서로 다른 타입의 계산은 큰 범위로 자동 형변환
 */
