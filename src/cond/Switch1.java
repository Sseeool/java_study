package cond;

import java.util.Scanner;

public class Switch1 {
    public static void main(String[] args) {
        int grade;
        int coupon;

        System.out.print("Please enter your grade: ");
        Scanner sc = new Scanner(System.in);
        grade = sc.nextInt();

        switch (grade) {
            case 1:
                coupon = 1000;
                break;
            case 2:
                coupon = 2000;
                break;
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
                break;
        }
        /*
         coupon = switch (grade) {
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
        };
         */
        System.out.println("Your coupon is " + coupon);
    }
}

/*
 Switch 문은 if 문을 좀 더 편리하게 사용할 수 있음
 break 가 없으면 그 뒤에거 다 수행

 if 문 vs switch 문
 1. switch 문의 조건식을 넣는 부분을 보면 x > 10 과 같은 조건이 아니라 단순히 값만 넣을 수 있음
 2. 조건이 특정 case 와 같은지만 체크할 수 있음. 값이 같은지 확인하는 연산만 가능. 문자도 가능
 3. 반면에 if 문은 참 거짓의 결과가 나오는 조건식을 자유롭게 적을 수 있음
 */