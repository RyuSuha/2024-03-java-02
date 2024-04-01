package com.green.PC;

public class MissionMultipleForLoop {
    public static void main(String[] args) {
        //int star = 2 ~ 6사이의 랜덤값 나올 수 있도록 세팅
        int star = (int)(Math.random() * 5) + 2;

        for(int i=1; i<=10; i++) {
            for(int j=star; j>0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
