package loop;

public class For2 {
    public static void main(String[] args) {
        int sum = 0;
        int endNum = 3;

        for (int i = 1; i < endNum; i++) {
            sum += i;
            System.out.println("i = " + i + " sum = " + sum);
        }
    }
}

/*
    for vs while

    for 문으로 작성하는게 더 좋은 이유: 초기화, 조건검사, 반복 후 작업 등이 규칙적으로 한 줄에 모두 들어 있음
    반복을 위해 값이 증가하는 카운터 변수를 다른 부분과 명확하게 구분할 수 있음
 */