package com.green.day2;

// 변수가 가진 값이 변경되려면 =(대입연산자)가 필요
    //예외 정수에 ++(앞뒤상관x) 가 붙으면 +1
public class Var2 {
    int ga1_$num; //전역 변수(지역 변수와 다르면 좋음)
    public static void main(String[] args){
        //지역 변수(초기화 필수!)
        //변수 선언과 동시에 초기화
        int num = 10, num2 = 11, num3 = 0;
        num3 = num + num2;
        //num3 = 10 + 11;
        //num3 = 21;
        num3 = num3 + 3;
        //num3 = 21 +3;
        //num3 = 24;
        System.out.println(num3);
        num3++;
        ++num3;
        ++num3;

        System.out.println(num3);

    }
}
