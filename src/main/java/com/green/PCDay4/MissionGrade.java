package com.green.PCDay4;

public class MissionGrade {
    public static void main(String[] args) {
        //int score = 0~100 사이의 랜덤 정수값 나올수 있도록
        int score = (int)(Math.random() * 101);
        System.out.println("score: " + score);

        //90점 이상은 "당신의 학점은 A입니다."
        //80점 이상은 "당신의 학점은 B입니다."
        //70점 이상은 "당신의 학점은 C입니다."
        //나머지는 "당신의 학점은 F입니다."
        if(score >= 90) {
            System.out.println("당신의 학점은 A입니다.");
        } else if(score >= 80) {
            System.out.println("당신의 학점은 B입니다.");
        } else if(score >= 70) {
            System.out.println("당신의 학점은 C입니다.");
        } else {
            System.out.println("당신의 학점은 F입니다.");
        }

        if(score > 100 || score < 0) {
            System.out.println("score 점수가 잘못되었습니다.");
        } else {
            String grade = "F";
            if(score >= 90)     { grade = "A";}
            else if(score >= 80){ grade = "B";}
            else if(score >= 70){ grade = "C";}
            System.out.printf("당신의 학점은 %s입니다.\n", grade);

        }
        System.out.println("--종료--");
    }
}
