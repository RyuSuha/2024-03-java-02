package com.green.day16.ch7;

public interface PlayingCard {
    //public static final 자동으로 붙음
    int CLOVER = 1;
    //public abstract 자동으로 붙음
    String getCardNumber();

}

interface DeepPlayingCard extends PlayingCard {
    String gerCardKind();
}

class PlayCard implements DeepPlayingCard {

    @Override
    public String getCardNumber() {
        return null;
    }

    @Override
    public String gerCardKind() {
        return null;
    }
}
class PlayCardTest {
    public static void main(String[] args) {
        PlayingCard pc = new PlayCard();
        pc.getCardNumber();
        DeepPlayingCard dpc = (DeepPlayingCard) pc; //형변환(호출하기위함)
        System.out.println("------끝------");
    }
}
