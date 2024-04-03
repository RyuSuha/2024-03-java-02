package com.green.day15.ch7;

public class OverrideTest {
    public static void main(String[] args) {
        Parent p = new Parent(55);

        System.out.println(p.age);



        Child child = new Child();
        //child.attack(); // Child에는 attack이 없어도 상속받은 Parent에 있으므로 값이나옴
        child.doubleAttack();
//        p.attack();
//        p.defense();




    }
}

class Parent { //모든 클래스는 Object에 상속받는다
    int age; //전역변수는 객체가 살아있는 한 유효함




    //생성자와 메소드의 차이: 생성자기준 리턴타입이 없다, 이름이 클래스명과 같다.

    Parent(int age) { //this. = 나자신의 주소값. (전역변수와 메소드만 가능)
        super();
                      //this() = 생성자가 생성자 호출
        this.age = age;//이름이 같으나 this를 붙여서 전역변수를 지칭
    }


    void attack() {
        System.out.println("부모가 공격한다.");
    }
    public void defense() {
        System.out.println("부모가 적의 공격을 방어한다.");
    }
}

class Child extends Parent { //그러므로 Child또한 Object에게 상속받음
    int mzPower;

    public Child() {
        super(123); // super()는 조상 생성자를 호출(지금은 Parent의 생성자)
                 // 매개변수(파라미터)가 동등해야 호출가능
        System.out.println(age);
    }

    @Override
        // 애노테이션 Annotation (골뱅이)
        // 부모중에 완전히 동일한 메소드가 있어야 오버라이드 가능
    public void attack() {
        System.out.println("자식이 적을 공격한다.");
        //this.attack(); //override에서 this로 호출하면 무한루프에 빠질수있음
        //super.attack();
    }
    public void doubleAttack() {
        this.defense();  //this는 child에서부터 defense를 찾고 없으면 parent로 올라감
        super.defense(); //super는 처음부터 parent에서 찾음
        System.out.println("------"); //this.생략시에도(앞에 아무것도 없어도) 적용
        this.attack();
        super.attack();
    }
}
