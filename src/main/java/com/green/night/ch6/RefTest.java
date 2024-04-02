package com.green.night.ch6;

public class RefTest {
    public static void main(String[] args) {
        Numbox nb1 = new Numbox();
        nb1.num = 100;

        Numbox nb2 = nb1; //동일성

        System.out.printf("nb1.num: %d\n", nb1.num);

        System.out.println("nb1 == nb2: " + (nb1 == nb2));

    }
}
