package com.green.night.ch5;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        int n1, n2, n3, n4, n5;
        String s1, s2, s3;

        //타입[] 이름 = new 타입[방갯수];
        int[] intArr = new int[50];
        intArr[0] = 30;
        int val = intArr[0]; //값 빼오기 배열이름[빼고싶은 방 번호];
        System.out.println("val: " + val);

        for (int i=0; i<intArr.length; i++) {
            intArr[i] = i + 10;
        }
        System.out.println(Arrays.toString(intArr));
        for(int i=0; i<intArr.length; i++ ) {
            System.out.printf("intArr[%d] >> %d\n", i, intArr[i]);
        }
    }
}
