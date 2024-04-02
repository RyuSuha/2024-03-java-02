package com.green.night.ch6;
//public은 파일명과 동일한 클래스에 한개 쓸수있다.
//public : 접근 제한자, 접근 지시어
//private, default, protected, public
public class Car {
    //2가지구성
    //멤버 필드, 속성, property, 전역변수
    int cc;
    String company;

    //멤버 메소드, 움직이는것(행동 등)
    void drive() {
        System.out.println(company + "자동차 붕붕");
    }
}

