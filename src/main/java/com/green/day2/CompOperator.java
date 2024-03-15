package com.green.day2;
//comparison operator 비교 연산자
public class CompOperator {
    public static void main(String[] args) {
        //정수형 데이터 타입인 int형
        //불린형 true, false값만 가질 수 있는 데이터 타입
        boolean b1 = true;
        boolean b2 = false;
        //boolean b3 = 32; 안됨

        boolean r1 = 10 > 9;
        System.out.println(r1);

        r1 = 10 < 9;
        System.out.println(r1);

        r1 = 10 >= 9; // 이상
        System.out.println(r1);

        r1 = 10 >= 10;
        System.out.println(r1);

        r1 = 10 <= 10;
        System.out.println(r1);

        r1 = 10 == 10; // 10은 10과 같니? > true
        System.out.println(r1);

        r1 = 10 != 10; // 10은 10과 다르니? > false
        System.out.println(r1);
        // 느낌표는 대체로 반대, 부정

    }
}
