package com.green.night.ch6;

public class DeepCopyTest {
    public static void main(String[] args) {
        Numbox nb1 = new Numbox();
        nb1.num = 200;

        Numbox nb2 = new Numbox();
        nb2.num = nb1.num;

        System.out.println("nb1 == nb2: " + (nb1 == nb2));

    }
}
