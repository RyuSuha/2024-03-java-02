package com.green.day2;

public class MissionOddEven {
    public static void main(String[] args) {
        int num = (int)(Math.random() * 10.0) + 1;
        int n4 = num % 2;

        if(n4 == 0) {
            System.out.println("num은 짝수입니다.");
        } else {
            System.out.println("num은 홀수입니다.");
        }
        //예를들어 --num이 만약 5라면 --
        //콘솔에 출력이 "5는(은) 홀수입니다.

        //예를들어 --num이 만약 10이라면 --
        //콘솔에 출력이 "10는(은) 짝수입니다."
    }
}
