package com.green.night.ch6;

public class PrimitiveRefTest {
    public static void main(String[] args) {
        int num = 10;

        Numbox nb = new Numbox();
        nb.num = 10;
        changeNum(nb);
        System.out.printf("nb.num: %d\n", nb.num);
    }

    public static void changeNum(int n) {
        n = 100;
    }
    public static void changeNum(Numbox nb2) {
        nb2.num = 100;
    }
}

class Numbox {
    int num;
}