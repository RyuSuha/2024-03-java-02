package com.green.night.exam;

import java.util.Scanner;
//문자열은 switch문이 편하다
public class SwitchTest2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("성별을 입력해주세요.");
        String gender = scan.nextLine();

        String result = switch (gender) {
            case "남", "남자" -> "You are Man!!";
            case "여", "여자" -> "You are woman!!";
            default -> "성별을 입력하세요.";
        };

        System.out.println(result);


        String result2 = switch (gender) {
            case "남", "남자" -> {
                System.out.println("you are man!!");
                yield "남자다!!";
            }
            case "여", "여자" -> {
                System.out.println("you are woman!!");
                yield "여자다!!";
            }
            default -> {
                System.out.println("성별을 입력해주세요.");
                yield "잘 입력해!!";
            }


        };
        System.out.println(result2);
    }
}
