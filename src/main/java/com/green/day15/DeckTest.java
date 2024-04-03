package com.green.day15;

public class DeckTest {
    public static void main(String[] args) {
        Deck deck = new Deck();
        //deck.printAllCard();

        Card c = deck.pick();
        System.out.println(c);

        Card c2 = deck.pick(5);
        System.out.println(c2);
        // 스페이드 6이 나오는 이유
        // 5번째 카드가 아니라 cards 배열의 5가 할당된 카드
        // 0부터 시작해서 5 이므로 6번째 카드 = 스페이드 6

        deck.shuffle();
        deck.printAllCard();

    }
}

class Deck {
    static final String[] kinds = { "Spade", "Heart", "Diamond", "Clova" };
    final int CARD_NUM;
    Card[] cards;

    void shuffle() { //i가 0~51일때 매번 각각 랜덤한 값으로 바뀜
        for(int i=0; i<cards.length; i++) {
            int rIdx = (int)(Math.random() * cards.length);
            if(i == rIdx) { continue; }
            Card temp = cards[i];
            cards[i] = cards[rIdx];
            cards[rIdx] = temp;
        }
    }

    Card pick() { // Card가 붙는 이유는 객체와 데이터타입이 같아야하기때문
        int rIdx = (int)(Math.random() * cards.length); // 0~51사이의 랜덤값
        Card c =  cards[rIdx];

        return c;
    }
    Card pick(int i) { //오버로딩 : 이름이 같은 메소드는 파라미터의 종류,
        Card c = cards[i]; //또는 갯수가 다르면(구분이 가능하다면) 존재가능
        return c;
    }


    Deck() {
        CARD_NUM = 52;
        cards = new Card[CARD_NUM];
        int idx = 0;
        for(int i=0; i<kinds.length; i++) { //kinds.length는 kinds배열의 총 갯수
            for(int z=1; z<=13; z++) {
                String kind = kinds[i];
                String number = switch(z) {
                    case 1 -> "A";
                    case 11 -> "J";
                    case 12 -> "Q";
                    case 13 -> "K";
                    default -> String.valueOf(z);
                };
                //Card c = new Card(kinds[i] , number);
                this.cards[idx++] = new Card(kind, number);

            }
        }

    }


    void printAllCard() {
        for(Card c : cards) {
            System.out.println(c);
        }
    }

}

class Card {
    String kind; //무늬
    String number; //번호(A, 2~10, J, Q, K)

    Card(String kind, String number) {
        this.kind = kind;
        this.number = number;
    }

    @Override
    public String toString() {
        return String.format("%s(%s)", kind, number);
    }
}
