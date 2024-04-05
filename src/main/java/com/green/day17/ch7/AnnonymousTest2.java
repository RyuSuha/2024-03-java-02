package com.green.day17.ch7;

public class AnnonymousTest2 {
    public static void main(String[] args) {
        Movable m1 = new MyMove();
        m1.move();

        Movable m2 = new Movable() { //익명클래스란? (인터페이스를 구현하는 클래스)
                                    //인터페이스를 만들고 그에 상속받는 클래스를 만들어 구현하고
                                    //객체를 만드는 작업을 대신해서
                                    //인터페이스의 객체를 만든 뒤 중괄호를 열고
                                    //인터페이스의 추상메소드를 오버라이드 해줄 수 있음
            @Override
            public void move() {
                System.out.println("일본으로 가자!!");
            }

        };
    }
}
interface Movable {
    void move();
}

class MyMove implements Movable {
    @Override
    public void move() {
        System.out.println("서울까지 가자~~");
    }
}