package operator;

public class Comp2 {
    public static void main(String[] args) {
        String str1 = "str1";
        String str2 = "str2";

        boolean result1 = "hello".equals("hello");
        boolean result2 = str1.equals("str1");
        boolean result3 = str1.equals(str2);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

        System.out.println("hello" == "hello"); // 특정한 조건에서 true 가 나오지 않기때문에 쓰면 안된다 !
    }
}
