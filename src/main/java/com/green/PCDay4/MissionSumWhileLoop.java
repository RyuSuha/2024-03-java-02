package com.green.PCDay4;

import java.util.Scanner;
public class MissionSumWhileLoop {
    public static void main(String[] args) {
        //입력한 모든 숫자를 더한 값 출력
        Scanner scan = new Scanner(System.in);
        int input = 0;
        int sum = 0; // sum선언을 while문 안에서 하면 스코프 문제로인해 출력안됨
        while(true) {
            System.out.print("숫자를 입력해 주세요. (종료:0) >>");
            input = scan.nextInt();
            if(input == 0) { break; }
            sum = sum + input;
            //System.out.println(sum);
        }

        System.out.println("sum: " + sum);
    }
}