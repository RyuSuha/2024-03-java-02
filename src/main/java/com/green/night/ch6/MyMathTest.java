package com.green.night.ch6;

public class MyMathTest {
    public static void main(String[] args) {
        MyMath mm = new MyMath();
        mm.sum(10, 20);
        mm.sum(100, 250);
        int result = mm.returnSum(30, 40);
        System.out.println("result: " + result);

        mm.abs(-10); //abs: 10
        mm.abs(30); // abs: 30

        int max = mm.getMax(10, 11);
        System.out.println("max: " + max);
        int max2 = mm.getMax(100, 11);

    }
}
//void 메소드와 return 메소드
//메소드의 3요소 : 리턴타입, 메소드명, 파라미터(매개변수)
class MyMath {

    int getMax(int n1, int n2) {
        return n1 > n2 ? n1 : n2;
    }
    //int getMax(int j1, int j2) {
        //int max = j1 - j2;
        //if (max < 0) {
           // System.out.println(j2);
        //} else {
         //   System.out.println(j1);
        //}
        //return max;



    void sum(int n1, int n2) {
        System.out.printf("%d + %d = %d\n" , n1, n2, n1 + n2);
    }
    int returnSum(int n1, int n2) {
        int sum = n1 + n2;
        return sum;
    }
    void abs(int n1) {
        if(n1 < 0) {
            int i = n1 * -1;
            System.out.println("abs: " + i);
        } else {
            System.out.println("abs: " + n1);
        }
    }
}
