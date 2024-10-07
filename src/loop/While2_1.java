package loop;

public class While2_1 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        while (i <= 10) {
            sum += i;
            System.out.println("Current sum is " + sum);
            i++;
        }
    }
}

/*
 좋은 코드인지 아닌지는 변경 사항이 발생했을 때 변경해야하는 부분이 적을수록 좋은 코드
 */