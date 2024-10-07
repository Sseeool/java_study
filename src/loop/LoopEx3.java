package loop;

public class LoopEx3 {
    public static void main(String[] args) {
        int num = 2, i = 0;

        while (i++ < 10) {
            System.out.println(num);
            num += 2;
        }
    }
}
