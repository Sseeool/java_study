package loop;

public class Break2 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        for (; sum <= 10; i++) {
            sum += i;
        }
        System.out.println("Exit when sum is over 10: i = " + i + " sum = " + sum);
    }
}

/*
    for (; ; ) // 무한 루프
    for 문의 초기식에서 선언한 변수는 for문에서만 사용 가능

    for 문을 좀 더 편리하게 사용하도록 도와주는 향상된 for문 또는 for-each 문으로 불리는 반복문도 있음
 */