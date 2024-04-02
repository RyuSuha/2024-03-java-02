package com.green.PCDay4;

public class ForLoop {
    public static void main(String[] args) {
        //      0        1       3          2
        //for( 초기화 ; 조건식 ; 증감식 ) { 반복코드 }

        for(int i=1; i<=5; i++) {
            System.out.println("안녕하세요");
        }

        // "hello" 6번 출력
        for(int i=5; i<11; i++) {
            System.out.println("hello");
        }

        for(int i=1; i<31; i*=3) {
            System.out.println("3배");
        } // 1 , 3 , 9 , 27 총 4회

        for(int i=1; i<9; i+=4) {
            System.out.println("4씩 더하기");
        }

        for(int i=2, j=3; i<=300; i*=2, j*=3) {
            System.out.printf("%d는 2의 제곱 %d는 3의제곱\n",
                     i, j);
        }

    }
}
