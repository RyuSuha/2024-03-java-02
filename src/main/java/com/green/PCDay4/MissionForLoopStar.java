package com.green.PCDay4;

public class MissionForLoopStar {
    public static void main(String[] args) {
        //int star = 3~10 랜덤한 값이 star 변수에 대입되도록

        int star = (int)(Math.random() * 8.0) + 3;
        System.out.println(star);

        for(int i=star; i>0; i--) {
            System.out.print("*");
        }
        System.out.println();
        for(int i=0; i<star; i++) {
            System.out.print("*");;
        }
    }
}
