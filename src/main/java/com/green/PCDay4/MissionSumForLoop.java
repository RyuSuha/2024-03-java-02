package com.green.PCDay4;

public class MissionSumForLoop {
    public static void main(String[] args) {
        //1~10까지 더한 값 출력

        int sum = 0;
        for (int i = 0; i<11; i++) {
            sum += i;
            //sum = sum + i와 같은 뜻
            //= 앞에 오는 기호에 따라 의미가 바뀜
        }
        System.out.println("sum: " + sum);
    }
}
