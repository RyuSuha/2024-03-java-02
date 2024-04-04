package com.green.night.exam;

public class RandomTest {
    public static void main(String[] args) {
        Math.random(); // 0~ 0.999999999999

        int r = (int)(Math.random() * 6.0);
        System.out.println(r);
    }
}
