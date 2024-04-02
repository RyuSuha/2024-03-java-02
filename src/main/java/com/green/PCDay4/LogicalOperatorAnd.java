package com.green.PCDay4;

public class LogicalOperatorAnd {
    public static void main(String[] args) {
        if(true && true && true) {
            System.out.println("true && true && true");
        }
        // &&은 중간에 결과가 정해지면 끝까지 계산 안함
        // &은 중간에 결과가 정해져도 끝까지 계산함
        // 0으로 나누면 오류
        boolean r = true & 1 + 3 != 5 & 1 / 1 == 1;
        System.out.println("r:" + r);

        boolean r2 = true && true && true && false;
        System.out.println("r2:" + r2);

        boolean r3 = true & true & true & true;
        System.out.println("r3:" + r3);

        boolean r4 = true & true & true & false;
        System.out.println("r4:" + r4);

        boolean r5 = r3 && r3 && r3 && r3;
        System.out.println("r5: " + r5);
    }
}
