package com.green.night.exam;

import java.sql.SQLOutput;

public class MethodTest {
    public static void main(String[] args) {
        int r = MyMath.abs(-10);
        System.out.println("r: " +r);

        MyMath mm = new MyMath();
        int b = mm.instanceAbs(-10);
        System.out.println("b: " + b);


        MyMath.printStar(5); //*****
        MyMath.printStar(3); //***
        System.out.println("---------------");
        MyMath.printSquare(3);
        MyMath.printSquare(4);
        System.out.println("---------------");
        MyMath.printTriangle(3);

    }
}

class MyMath {
    int n1;
    //메소드의 구성요소 3가지 (리턴타입, 메소드명, 파라미터)
    static int abs(int num) {
        return num < 0 ? -num : num;
    }

    int instanceAbs(int num) {
        return num < 0 ? -num : num;

    }
    static void printStar(int m) {
        for(int i = 0; i < m; i++){
            System.out.print("*");
        }
        System.out.println();
    }
    static void printSquare(int j) {
        for(int i = 0; i < j; i++){
            printStar(j);
//            for(int n = 0; n < j; n++){
//                System.out.print("*");
//            }
//            System.out.println();
        }
    }
    static void printTriangle(int tri) {
        for(int i = 0; i < tri; i++) {
            printStar(i+1);
        }
    }

}