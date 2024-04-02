package com.green.PCDay4;

public class LogicalOperatorNot {
    public static void main(String[] args) {
        boolean r = true && true && true;
        System.out.println("!!r: " + !!r);
        System.out.println("!r: " + !r);
        System.out.println("r: " +r);
        // !=비교연산자
        // ! 논리연산자

        //toggle처리
        boolean tg = true;
        tg = !tg;
        System.out.println("tg-1: " + tg);
        tg = !tg;
        System.out.println("tg-2: " + tg);
        tg = !tg;
        System.out.println("tg-3: " + tg);
        tg = !tg;
        System.out.println("tg-4: " + tg);

        // 위에서부터 하나씩 계산하면서 내려감
        // 첫째줄 tg(true) = !tg(false)
        // 둘째줄 tg(false) = !tg(true)
        int tg2 = 0;
        tg2 = 1 - tg2;
        System.out.println("tg2-1: " + tg2);
        tg2 = 1 - tg2;
        System.out.println("tg2-2: " + tg2);
        tg2 = 1 - tg2;
        System.out.println("tg2-3: " + tg2);
    }
}
