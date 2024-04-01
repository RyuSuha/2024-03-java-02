package com.green.PC;

public class MissionForLoopGugudan {
    public static void main(String[] args) {
        int dan = (int)(Math.random() * 8.0) + 2; //2~9랜덤값
        System.out.println("dan: " + dan);

        for(int i=1; i<10; i++) {
            //System.out.println(dan + " x " + i " = " (dan*i));
            System.out.printf("%d x %d = %d,000\n", dan, i, (dan*i));

            //int num = 1000000;
            //System.out.printf("%,d\n", num);
        }
    }
}
