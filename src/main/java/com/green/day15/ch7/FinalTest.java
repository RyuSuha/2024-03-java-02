package com.green.day15.ch7;

public class FinalTest {
    public static void main(String[] args) {
        Car c = new Car(2200);
        System.out.println(c.CC);
        //c.cc = 100;
        Car c2 = new Car(3000);
        System.out.println(c2.CC);

        //c2.cc = 200;
    }
}

class Car {
    final int CC; //생성자를 이용하면 Lazy처리 가능

    Car(int cc) {
        this.CC = cc;
    }

    Car() {
        CC = 100;
    }

    final void start() { //메소드 앞에 final 작성하는 경우 오버라이딩 안됨.
        System.out.println("자동차 시동을 건다.");
}

//final class Suv extends Car { //final = 상속할수 없음 (아래로)

//    void start() {
//        System.out.println("자동차 시동을 건다.");
//    }
//    }
}
/*
class tuscon extends String {

}
 */

