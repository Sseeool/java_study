package loop;

public class Nested1 {
    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            System.out.println("External for Start i: " + i);
            for (int j = 0; j < 3; j++) {
                System.out.println(" -> Internal for " + i + "-" + j);
            }
            System.out.println("External for End i: " + i);
            System.out.println();
        }
    }
}

/*
    중첩 반복문
    반복문 내분에 또 반복문 만들기
 */
