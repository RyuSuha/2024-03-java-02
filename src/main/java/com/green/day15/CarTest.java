package com.green.day15;

public class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car("white", "auto", 5);
        System.out.printf("c1.color: %s, c1.gearType: %s, c1.door: %d\n"
                , c1.color, c1.gearType, c1.door);

        Car c2 = new Car("black", "manual", 3);
        System.out.printf("c2.color: %s, c2.gearType: %s, c2.door: %d\n"
                , c2.color, c2.gearType, c2.door);

        Car c3 = new Car();
        System.out.printf("c3.color: %s, c3.gearType: %s, c3.door: %d\n"
                , c3.color, c3.gearType, c3.door); //red, manual, 5

        Car c4 = new Car(c2);
        System.out.printf("c4.color: %s, c4.gearType: %s, c4.door: %d\n"
                , c4.color, c4.gearType, c4.door); //black, manual, 3

        System.out.println(c2 == c4);
        // 얕은 복사 : Car c4 = c2 (주소값만 복사)
        // 깊은 복사 : Car c4 = new Car(c2) (동등한 객체를 복사)

    }

}

class Car {
    String color;
    String gearType;
    int door;

    Car() {
//        this.color = "red";
//        this.gearType = "manual";
//        this.door = 5;
        this("red", "manual", 5);
    }
    Car(Car car) {
//        this.color = car.color;
//        this.gearType = car.gearType;
//        this.door = car.door;
        this(car.color, car.gearType, car.door);
    }

    Car(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
        init();
    }

    void init() {

    }

    void start() {
        System.out.println("차 시동을 건다.");
    }
}
