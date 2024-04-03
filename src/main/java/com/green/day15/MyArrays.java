package com.green.day15;

import java.util.Arrays;

class MyArrays {
    static void printArr(int[] arr) {
        if(arr.length == 0) {
            System.out.println("[]");
            return;
        }
        System.out.printf("[%d", arr[0]);
        for(int i=1; i<arr.length; i++) {
            System.out.printf(", %d", arr[i]);
        }
        System.out.println("]");
    }
    //리턴타입, 메소드명, 파라미터
    static String toString(int[] arr) {
        if(arr.length == 0) { return "[]"; }
        //String str = "[" + arr[0];
        String str = String.format("[%d", arr[0]);
        for(int i=1; i<arr.length; i++) {
            str += String.format(", %d", arr[i]);
        }
        str += "]";
        return str;
    }
}

class MyArraysTest {
    public static void main(String[] args) {

        int[] arr = { 3, 2, 1, 6, 5, 4, 10 };
        MyArrays.printArr(arr); // [3, 2, 1, 6, 5, 4, 10]
        //MyArrays.printArr(arr); 을 보고 알 수 있는점
        //void 타입, 파라미터 int배열 1개, MyArrays 클래스에 메소드가 존재
        //메소드명:printArr, static 메소드
        String str = Arrays.toString(arr);
        System.out.println("str: " + str);

        String str2 = MyArrays.toString(arr);
        System.out.println("str2: " + str2);

        String str3 = MyArrays.toString(arr);
        System.out.println("str2 == str3: " + (str2 == str3));
        System.out.println("str.equals(str3): " + str2.equals(str3));
    }
}
