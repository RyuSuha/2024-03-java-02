package com.green.day2;

public class RandomValue {
    public static void main(String[] args) {
        System.out.println(Math.random() * 1000.0);
        //0.000000 ~ 0.999999 1은 나오지않음.
        //형변환, 타입이 안 맞으면 맞게 타입 변화를 줘야 한다.
        //자동형변환, 강제형변환

        int result = (int)(Math.random() * 10); //0~9
//        result = (int)(0.67662838 * 10);
//        result = (int)(0.67662838 * 10.0);
//        result = 6.7662838;
//        result = 6;
    }
}
