package com.green.PCDay4;

public class MultipleForLoop {
    public static void main(String[] args) {

        for(int z=0; z<15; z++) {
            for(int i=0; i<5; i++) {
                System.out.printf("%d & %d\n", z, i);
            }
            System.out.printf(" %d회\n", z);
        }
        for(int i=5; i<11; i++) {
            System.out.println((i - 4) + ".Hello");
        }
    }
}
