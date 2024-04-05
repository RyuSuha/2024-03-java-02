package com.green.night.exam;

import java.util.Arrays;

public class ShuffleTest {
    public static void main(String[] args) {
        int[] arr = new int[20]; //콜렉션

        //5~34

        for(int i = 0; i < arr.length; i++) {
            arr[i] = i + 5;
        }
        System.out.println("--------------");
        int i = 0;
        for(int val : arr) {
            System.out.println(val);
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("--------------");

        for(int z=0; z<arr.length; z++) { // 0~arr.lengh-1
            int rIdx = (int)(Math.random() * arr.length);

            int temp = arr[z];
            arr[z] = arr[rIdx];
            arr[rIdx] = temp;

        }
    }
}
