package com.green.day16.ch7;

public class PolyTest2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        BullDog bullDog = new BullDog();
        Cat cat = new Cat();
        Animal ani = new Animal();
        //리턴타입 void, 파라미터 1개씩 받는다, static, 메소드 위치는 PolyTest
        doCrying(dog) ; //강아지 멍멍 강아지가 잔다.
        doCrying(bullDog);//불독이 월월 불독이 잔다.
        doCrying(cat);//고양이 야옹
        doSleep(dog) ;
        doSleep(bullDog) ;
        doSleep(ani);


    }

    public static void doCrying(Animal ani) { //ani는 변수명
        //ani.crying();

//        if(ani instanceof Dog) { // 아래와 똑같음
//            Dog dog = (Dog)ani;
//            dog.sleep();
//        }
        if(ani instanceof Dog dog) { //enhanced instanceof
            dog.sleep();
        }
        // PolyTest.java에 이미 작성된 클래스가 존재하니까 public static
        // dog bulldog cat은 모두 Animal에 상속된 클래스들이므로
        // Animal클래스에 각 객체를 넣으면 xxx.crying(); 실행됨
    }
    public static void doSleep(Animal ani) {
        if (ani instanceof Dog) { //if문 해석 : ani가 Dog로 형변환이 가능하다면
            ((Dog)ani).sleep();   //ani.sleep();를 실행
        }
        //((Dog)ani).sleep(); //ani라는 객체 앞에 (Dog)해줌으로써 Dog클래스로 형변환
    }
//    public static void doSleep(Dog ddog) {
//        ddog.sleep();
//    }
}

