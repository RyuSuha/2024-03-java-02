package com.green.day2;

public class Practice {
    public static void main(String[] args) {
        int ff = (int)(Math.random() * 10) + 1;
        int gg = ff + 2;
        System.out.print(ff);
        System.out.print("는(은) ");
        System.out.print(gg % 2 == 0 ? "짝" : "홀");
        System.out.println("수입니다.");

        System.out.print(gg);
        System.out.print("는(은) ");
        System.out.print(gg >= 5 ? "5 이상" : "5 미만");
        System.out.println("입니다.");

        boolean j1 = true;
        boolean j2 = false;



        System.out.println(gg != ff);
    }
}
