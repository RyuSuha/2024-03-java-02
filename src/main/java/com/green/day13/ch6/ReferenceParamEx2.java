package com.green.day13.ch6;

public class ReferenceParamEx2 {
    public static void main(String[] args) {
        int[] intArr = { 10, 20 };

        System.out.printf("intArr[0]: %d, intArr[1]: %d\n"
                , intArr[0], intArr[1]); //10,20

        //change(intArr);

        System.out.printf("intArr[0]: %d, intArr[1]: %d\n"
                , intArr[0], intArr[1]); //11,21
    }
}
