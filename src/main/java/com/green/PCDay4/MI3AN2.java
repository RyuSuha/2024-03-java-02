package com.green.PCDay4;

import java.util.Scanner;

public class MI3AN2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("성별을 입력해 주세요.(남/여) >> ");
        String gender = scan.nextLine();
        System.out.print("당신의 키를 입력해 주세요 >> ");
        int height = scan.nextInt();
        int standHeight = 161; //여자평균키

        if("남".equals(gender) || "여".equals(gender)) {
            if("남".equals(gender)) {
                standHeight = 175;
                System.out.print("남자 ");
            } else {
                System.out.print("여자 ");
            }
            if(height > standHeight) {
                System.out.println("평균보다 큽니다.");
            } else if(height < standHeight) {
                System.out.println("평균보다 작습니다.");
            } else {
                System.out.println("평균입니다.");
            }
        } else {
            System.out.println("성별을 입력해 주세요.");
        }
        System.out.println("--종료--");
    }
}
