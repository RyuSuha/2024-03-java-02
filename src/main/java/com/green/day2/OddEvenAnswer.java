package com.green.day2;

import java.sql.SQLOutput;

public class OddEvenAnswer {
    public static void main(String[] args) {
        int num = (int)(Math.random() * 10) + 1;
        System.out.print(num);
        System.out.print("는(은) ");

        if(num % 2 == 0) {
            System.out.print("짝");
        } else {
            System.out.print("홀");
        }
        System.out.println("수입니다.");
    }
}
