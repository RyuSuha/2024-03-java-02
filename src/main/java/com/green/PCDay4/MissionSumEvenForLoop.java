package com.green.PCDay4;

public class MissionSumEvenForLoop {
    public static void main(String[] args) {
        //1~100까지 짝수만 더한 값 출력
        int sum = 0;
        for(int i = 1; i <= 100; i++) {
            // i = 0이 아닌 i = 1인 이유는 0은 계산할필요가 없어서
            if(i % 2 == 0) {
                sum = sum + i;
                //sum += i;
            }
        }
        System.out.println("sum: " + sum);

        int sum2 = 0;
        for(int i=2; i<=100; i+=2) {
            sum2 += i;
        }
        System.out.println("sum2: " + sum2);

    }
}
