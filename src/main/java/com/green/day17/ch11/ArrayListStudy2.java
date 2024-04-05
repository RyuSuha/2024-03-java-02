package com.green.day17.ch11;

import java.util.ArrayList;
import java.util.List;

public class ArrayListStudy2 {
    public static void main(String[] args) {
        int n1 = 10;
        Integer n2 = 10;//Integer은 int의 레퍼런스 타입

        double d1 = 10.1;
        Double d2 = 10.1;//보통은 primitive타입의 앞글자를 대문자로 바꿔주면 레퍼런스 타입이 됨.

        List<Integer> list = new ArrayList(); //ArrayList가 원본이나 import하고 Array생략가능
        list.add(10);                         //List<> list = new ArrayList(); 에서
        list.add(20);                         //List와 ArrayList는 상속관계 (List가 상위)
        list.add(30);
        list.add(40);

        list.remove(2); //()번 방 삭제 (앞으로 한칸씩 당겨져옴)
        //list.add("우우우"); //데이터타입이 Integer(정수)로 확정되었으므로 문자열은 안됨
        int r1 = list.get(0); // 데이터타입이 같으므로 값 빼오기 가능
        int r2 = list.get(1); // r2 = 배열 1번 칸(2번째)에 있는 값

        System.out.println(list);

        for (int i = 0; i < list.size(); i++) { // list.size() = 배열.length
            System.out.printf("list.get(%d) >> %d\n", i, list.get(i));
        }
    }
}