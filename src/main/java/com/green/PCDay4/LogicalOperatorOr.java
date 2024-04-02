package com.green.PCDay4;

public class LogicalOperatorOr {
    public static void main(String[] args) {
        boolean r = false || true || false;
        System.out.println("r: " + r);
        boolean r2 = false || false || false;
        System.out.println("r2: " + r2);

        // || 는 또는 이기에 한개라도 true라면 true
    }
}
