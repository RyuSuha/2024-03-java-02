package com.green.night.exam;

public class SwitchTest {
    public static void main(String[] args) {
        String s1 = new String("안녕");
        String s2 = new String("안녕");

        System.out.println(s1 == s2);
        s1 = s2; //얕은복사
        System.out.println(s1 == s2);

        String gender = "남";

        switch(gender) {
            case "남":
                break;
        }
    }
}
