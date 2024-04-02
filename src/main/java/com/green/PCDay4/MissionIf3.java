package com.green.PCDay4;

import java.util.Scanner;
public class MissionIf3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("성별을 입력해 주세요.(남/여) >> ");
        String gender = scan.nextLine();


        //남자 평균키 : 175, 여자 평균키 : 161
        //gender "남", 기준값이 175
        //gender "여", 기준값이 161
        //gender "남 or 여 아니면" 성별을 입력해 주세요. > 종료

        if ("남".equals (gender)) {
            final int STAND_Height = 175;
            System.out.print("당신의 키를 입력해 주세요 >> ");
            int height = scan.nextInt();
            if (height > STAND_Height) {
                System.out.println("당신은 평균보다 큽니다.");
            } else if (height < STAND_Height) {
                System.out.println("당신은 평균보다 작습니다.");
            } else {
                System.out.println("당신은 평균입니다.");
            }
        } else if ("여".equals (gender)) {
            System.out.print("당신의 키를 입력해 주세요 >> ");
            int height = scan.nextInt();
            final int STAND_height = 161;
            if (height > STAND_height) {
                System.out.println("당신은 평균보다 큽니다.");
            } else if (height < STAND_height) {
                System.out.println("당신은 평균보다 작습니다.");
            } else {
                System.out.println("당신은 평균입니다.");
            }
        } else {
            System.out.println("성별을 입력해주세요.");
        }
        System.out.println(" 종료 ");
    }
}

