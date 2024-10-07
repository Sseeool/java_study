package loop;

public class While1 {
    public static void main(String[] args) {
        int count = 0;

        while (count < 100) {
            count++;
            System.out.println("Current number: " + count);
        }
    }
}

/*
 조건에 따라 코드 반복 실행

 while 문이 false 일 경우 빠져나옴
 */
