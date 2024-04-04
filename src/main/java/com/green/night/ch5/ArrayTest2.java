package com.green.night.ch5;

import java.util.Arrays;

public class ArrayTest2 {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30 }; //
        System.out.println(Arrays.toString(arr));
        System.out.println("--------------");
        //for(int i=0);


        int[] arr2 = new int[3];
        for(int i = 0; i<arr2.length; i++) {
            arr2[i] = i * 10;
            System.out.printf("%d, ", arr2[i]);
        }




    }
}
