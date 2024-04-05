package com.green.day17.ch11;

import java.util.ArrayList;

public class ArrayListStudy {
    public static void main(String[] args) {

        Object obj = 10;
        obj = "하하하하";
        obj = 11.1;

        ArrayList list = new ArrayList(); //배열이지만 어떤 타입이든 안에 담을수있음
        list.add(10); // 0번방에 값이 대입
        list.add(20); // 1번방에 값이 대입
        list.add(30); // 2번방에 값이 대입
        list.add("하하하하하"); // 3번방에 값이 대입
        list.add(11.1); // 4번방에 값이 대입

        // ArrayList는 위의 방법으로 쓰면 안됨

        int r = (int)list.get(0); //그러므로 값을 빼내기위해선 데이터타입을 동일하게 해야함
        r = (int)list.get(1);
        r = (int)list.get(2);
        r = (int)list.get(3);

        System.out.println("----종료----");
    }
}
