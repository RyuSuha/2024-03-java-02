package com.green.night.ch6;

public class StaticTest {
    public static void main(String[] args) {
        MyMath2.staticSum(10, 20);
        MyMath2.staticSum(100, 205);

        MyMath2 mm = new MyMath2();
        mm.n1 = 30;
        mm.n2 = 40;
        mm.sum();
        mm.n1 = 100;
    }
}

class MyMath2 {
    int n1, n2;

    void sum() {
        System.out.println(n1 + n2);

    }
    static void staticSum(int n1, int n2) {
        System.out.println(n1 + n2);

    }
}