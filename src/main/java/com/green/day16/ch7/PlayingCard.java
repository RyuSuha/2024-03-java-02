package com.green.day16.ch7;

public interface PlayingCard { //public이 붙으려면 파일명과 인터페이스명이 동일해야함(클래스와같음)
    //public static final 자동으로 붙음
    int CLOVER = 1; //인스턴스로는 사용불가
    //public abstract 자동으로 붙음
    String getCardNumber(); //추상메소드(선언부)만 작성

}

class PlayCardSecond implements PlayingCard {
    public String getCardNumber() { return null; }
    }


interface DeepPlayingCard extends PlayingCard {
    String getCardKind();
}

class PlayCard implements DeepPlayingCard { //인터페이스를 구현화(구현부작성) 하기위해 작성

    @Override
    public String getCardNumber() {
        return null;
    }

    @Override
    public String getCardKind() {
        return null;
    }
}
class PlayCardTest {
    public static void main(String[] args) {

        PlayingCard pc = new PlayCard(); //pc는 PlayingCard의 주소값 뿐만아니라
        pc.getCardNumber();              //PlayingCard를 상속(extends, implements)받은
        //pc.getCardKind();              //클래스나 인터페이스의 주소값도 가질수있음
        DeepPlayingCard dpc = (DeepPlayingCard) pc; //형변환(호출하기위함)
        dpc.getCardKind();                       //강제형변환은 상속관계일 경우에만
        System.out.println("------끝------");
        //? ddd = new PlayCardSecond();
        //? : PlayingCard, PlayCardSecond, Object
    }

}

