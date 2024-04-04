package com.green.day16.ch7;

public class PolyTest3 {
    public static void main(String[] args) {
        BullDog bullDog = new BullDog();



        //instanceof 왼쪽은 변수 오른쪽은 클래스
        //왼쪽에 있는 객체가(bullDog)가 오른쪽에 있는 객체(Dog)로
        //형변환이 가능하면 true 아닐시 false
        boolean r = bullDog instanceof Dog;
        System.out.println("r: " + r);
        // Animal은 Dog에게 상속하는 클래스이므로 형변환 x
        Animal ani = new Animal(); //false
        System.out.println("ani instanceof Dog: " + (ani instanceof Dog));
        // 아래에서 ani를 BullDog주소값으로 바꿈
        ani = new BullDog(); //true
        System.out.println("ani instanceof Dog: " + (ani instanceof Dog));

    }
}
