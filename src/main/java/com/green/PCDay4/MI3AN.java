package com.green.PCDay4;

import java.util.Scanner;

public class MI3AN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("성별을 입력해 주세요.(남/여) >> ");
        String gender = scan.nextLine();
        System.out.print("당신의 키를 입력해 주세요 >> ");
        int height = scan.nextInt();

        if ("남".equals(gender)) {

            if (height > 175) {
                System.out.println("남자 평균보다 큽니다.");
            } else if (height < 175) {
                System.out.println("남자 평균보다 작습니다.");
            } else {
                System.out.println("남자 평균입니다.");
            }
        } else if ("여".equals(gender)) {

            if (height > 161) {
                System.out.println("여자 평균보다 큽니다.");
            } else if (height < 161) {
                System.out.println("여자 평균보다 작습니다.");
            } else {
                System.out.println("여자 평균입니다.");
            }
        } else {
            System.out.println("성별을 입력해 주세요.");
        }
        System.out.println("--끝--");
    }
}