package com.green.PC;

public class IfMultiple {
    public static void main(String[] args) {
        int val1 = 50, val2 = 93;
        //val1이 짝수면 (val2도 짝수면 val2 - val1값을 출력, 홀수면 그대로)
        //val1이 홀수면 (val2가 짝수면 val2 - 5값을 출력, 홀수면 그대로)

        if(val1 % 2 == 0) {

            if(val2 % 2 == 0) {
                System.out.println(val2 - val1);
            } else {
                System.out.println(val2);
            }
        } else {

            if(val2 % 2 == 0) {
                System.out.println(val2 - 5);
            } else {
                System.out.println(val2);
            }
        }
    }
}
