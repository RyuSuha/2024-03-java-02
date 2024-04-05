package com.green.day17.ch7;

public class EqualsStudy {
    public static void main(String[] args) {
        Numbox n1 = new Numbox(10);
        Numbox n2 = new Numbox(11);
        System.out.println(n1 == n2); // n1, n2는 레퍼런스 타입이므로
                                      // n1 == n2는 서로 주소값이 같냐고 물어보는것. false
        System.out.println(n1.equals(n2)); // equals는 주소값 비교
    }
}

class Numbox {
    private int num;

    Numbox(int numb) {
        this.num = numb;
    }
//    @Override
//    public boolean equals(String str) {
//
//    }
    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Numbox)) { // !(@@) = @@의 내용의 반대
            return false;
        }
        Numbox numbox = (Numbox) obj; //형변환
        return this.num == numbox.num;
    }


}