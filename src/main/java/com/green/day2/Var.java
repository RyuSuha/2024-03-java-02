package com.green.day2;
// main 메소드 String[] args 매개변수
// "="(대입연산자) 은 오른쪽에 있는 값을 복사해서 준다
// 상수(10, 20 등 변하지 않는 값)는 리터럴 (literal)
// int(정수/소숫점이 없음) 소숫점이 있는 건 실수

public class Var {
    public static void main(String[] args) {
        int a1_$num; //변수 선언 declare, 값을 담기 위해
        a1_$num = 10;
        System.out.println(a1_$num);

        a1_$num = 20;
        System.out.println(a1_$num);

        a1_$num = 20 + 30; // 사칙연산 가능
        System.out.println(a1_$num);

        a1_$num = 10 * 40;
        System.out.println(a1_$num);

        a1_$num = 10 / 2;
        System.out.println(a1_$num);

        a1_$num = 10 - 3;
        System.out.println(a1_$num);

        a1_$num = 10 % 2; // %는 나누기 후 나머지값 (짝수 홀수 구분에 사용)
        System.out.println(a1_$num);

        a1_$num = 9 % 2;
        System.out.println(a1_$num);

    }
}
