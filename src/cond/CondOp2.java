package cond;

import java.util.Scanner;

public class CondOp2 {
    public static void main(String[] args) {

        System.out.print("Please enter your age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        String status = (age >= 18) ? "adult" : "minor";
        System.out.println("age = " + age + ", status = " + status);
    }
}

/*
 삼항 연산자
 (조건) ? 참_표현식 : 거짓_표현식

 - 항이 세 개라는 뜻.
 - 조건에 만족하면 참_표현식 실행, 그렇지 않으면 거짓_표현식 실행
 - 코드 블럭을 넣을 수 잇는 것이 아니라 단순한 표현식만 넣을 수 있음
 */
