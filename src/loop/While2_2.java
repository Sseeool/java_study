package loop;

public class While2_2 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        int endNum = 10;

        while (i <= endNum) {
            sum += i;
            System.out.println("Current sum is " + sum);
            i++;
        }
    }
}
