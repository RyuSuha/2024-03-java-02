package com.green.PC;

public class ContiuneBreak {
    public static void main(String[] args) {
        for(int i=0; i<10; i++) {
            System.out.println(i);
        }
        System.out.println("----------- break");

        for(int i=0; i<10; i++) {
            if(i == 5) { break; }
            System.out.println(i);
        }
        System.out.println("----------- contiune");
        for(int i=0; i<10; i++) {
            if(i == 5) { continue; }
            System.out.println(i);
        }
    }
}
