package com.green.day15.ch7;

public class AbstractTest {
    public static void main(String[] args) {
        //Dog d = new Dog(); // 추상클래스는 객체화 불가
        KoreaShortCat ksc = new KoreaShortCat();
        ksc.crying();
    }
}

abstract class Dog { //abstract : 추상. 추상 클래스

}

abstract class Cat { //추상메소드를 단 하나만 가지고 있어도
    int age;         //클래스는 추상클래스가 되어야함
    //추상 메소드
    abstract void crying();
    void jump() {
        System.out.println("폴짝 폴짝");
    }
}

class KoreaShortCat extends Cat { //추상클래스를 상속 받으려면
    @Override                     //추상메소드를 오버라이드 해야함
    void crying() {
        System.out.println("야옹~ 야옹~");
    }
}

class AmericaCat extends Cat {

    @Override
    void crying(){
        System.out.println("미유~~ 미유~~");
    }
}