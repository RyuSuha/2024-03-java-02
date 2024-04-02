package com.green.PCDay5;

public class PrintFormat2 {
    public static void main(String[] args) {
        String name = "김";
        int age = 30;
        double height = 172.2;
        char bloodType = 'O';
        boolean isSingle = true; //ture > 싱글입니다. false > 싱글이 아닙니다.

        System.out.println("저의 이름은 " + name + "입니다. 나이는 " + age +"살, 키는 " +
                 height + "cm, 혈액형은 " + bloodType + "형, " +
                (isSingle ? "싱글입니다." : "싱글이 아닙니다."));

        //저의 이름은 홍길동 입니다. 나이는 22살 키는 178.2cm, 혈액형은 A형, 싱글입니다.
        System.out.printf("저의 이름은 %s입니다. 나이는 %s살, 키는 %scm, 혈액형은 %s형, %s\n"
                , name, age, height, bloodType, isSingle ? " 싱글입니다. " : " 싱글이 아닙니다. " );

    }
}
