package com.green.night.exam;

public class StaticTest {
    public static void main(String[] args) {
        MyData md1 = new MyData();
        md1.name = "가길동";
        md1.company = "삼성";

        MyData md2 = new MyData();
        md2.name = "나길동";
        md2.company = "LG";

        MyData md3 = new MyData();
        md3.name = "다길동";
        md3.company = "SK";

        System.out.printf("%s, %s\n", md1.name, md1.company);
        System.out.printf("%s, %s\n", md2.name, md2.company);
        System.out.printf("%s, %s\n", md3.name, md3.company);
    }
}

class MyData {
    String name;
    static String company;
}
