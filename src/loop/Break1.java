package loop;

public class Break1 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        while(true) {
            sum += i;
            if (sum > 10) {
                System.out.println("Exit when sum is over 10: i = " + i + " sum = " + sum);
                break;
            }
            i++;
        }
    }
}

/*
    break와 continue는 반복문에서 사용할 수 있는 키워드
    break 는 반복문을 즉시 종료하고 나감
    continue는 반복문의 나머지 부분을 건너뛰고 다음 반복으로 진행. 즉시 조건식으로 이동
    while, do-while, for 와 같은 모든 반복문에서 사용 가능
 */

/*
    while(true) 무한루프
 */
