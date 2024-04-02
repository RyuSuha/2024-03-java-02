package com.green.PCDay4;

public class MissionStarTriangle {
    public static void main(String[] args) {
        //int star = 3~7 사이의 랜덤값

        /*
        star = 3;
        *     0 1
        **    1 2
        ***   2 3

        star = 5;
        *     0 1
        **    1 2
        ***   2 3
        ****  3 4
        ***** 4 5

         */
        int star = (int)(Math.random() * 5) +3;
        System.out.println("star = " + (star-1));
        for(int i = 1; i < star; i++) {
            for(int j = 1; j <= i; j++) {

                System.out.print("*");

            }
            System.out.printf(" %d %d", i-1, i);
            System.out.println();
        }


    }
}
