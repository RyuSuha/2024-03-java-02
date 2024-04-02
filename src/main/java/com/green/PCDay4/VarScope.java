package com.green.PCDay4;

public class VarScope {
    public static void main(String[] args) {
        /*
        스코프 개념은 모든 언어가 동일
        변수가 선언이 되면 그 변수를 감싸고 있는 중괄호{} 있다.
        그 중괄호를 벗어나면 죽습니다.(무효)
         */
        int num = 20;
        if(1 > 0) {
            //System.out.println(num2); //num2는 사용할수 없다.
            int num2 = 10;
            System.out.println(num2);
        }
        if(1 > 0) {
            int num2 = 10; //위 if문에 있는 num2와 같은 이름 사용가능
                            // 왜? 스코프(살아있는 범위{})가 다르기 때문
            System.out.println(num2);
        }
        //System.out.println(num2); //num2는 사용할 수 없다.

        System.out.println("-------------------");

        for(int i=0; i<10; i++) {

        }
        for(int i=0; i<10; i++) {
            int bb = 0;

            bb = bb + i;
        }
        //System.out.println(i); //for문에 선언된 index는 for문 안에서만 살아있음
        int i=0;
        for(; i<11; i++) {

        }
        System.out.println(i);
        //앞서서 초기화 선언(i=0)을 했기때문에 for문 안에는 생략
        //0부터 시작해서 10까지 올라간뒤 마지막 1 더해져서 값은 11
    }
}
