package com.green.day2;

public class ConditionalOperator {
    public static void main(String[] args) {
        //삼항식, 조건식
        //식 ? ture일 때 : false일 때 ;
        String s;
        s = 9 % 2 == 0 ? "짝" : "홀" ;
        System.out.println(s);

        int num = (int)(Math.random() * 10) + 1;
        System.out.print(num);
        System.out.print("는(은) ");

        s = num % 2 == 0 ? "짝": "홀";
        System.out.print(s);
        System.out.println("수입니다.");

    }
}
