package com.green.day15.ch7;

public class ConstructorTest {
    public static void main(String[] args) {
        Tiger tiger = new Tiger(15, "TT");
        System.out.printf("%d, %s", tiger.age, tiger.name);
    }
}

class Animal {
    int age;

    public Animal(int age) {
        super();
        this.age = age; // Animal클래스에서 선언한 정수 age와 생성자Animal의 파라미터 정수 age는 같다
    }

    public Animal() {
        super(); //Object의 기본생성자 호출
    }

}

class Tiger extends Animal {
    String name;

    Tiger() {
        super(10);
        System.out.println(age);
    }

    Tiger(int age) {
        super(age);
    }

    Tiger(int age, String name) {
        super(age); //Animal의 기본생성자 호출
        this.name = name;
        System.out.println();
    }
}