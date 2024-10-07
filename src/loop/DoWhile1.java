package loop;

public class DoWhile1 {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println("Current num: " + i);
            i++;
        }
        while (i < 3);
    }
}

/*
 조건에 상관없이 무조건 한 번은 실행
 최초 한 번은 코드 블럭을 곡 사용해야하는 경우
 */
