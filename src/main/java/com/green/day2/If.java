package com.green.day2;
//IF 는 불린
//else는 IF가 실패했을 경우 실행
//메소드인지 아닌지 판별할때는 소괄호 찾기
public class If {
    public static void main(String[] args) {
        int n1 = 10, n2 = 20;
        n2 = 30;
        if(n1 > n2) {
            System.out.println("n1이 n2보다 초과 값입니다.");
        } else {
            System.out.println("n1이 n2보다 미만값입니다.");
        }

        n2 = 10;
        if(n1 < n2) {
            System.out.println("n1이 작다.");
        } else if (n1 >n2) {
            System.out.println("n1이 크다.");
        } else if (n1 == n2) {
            System.out.println("n1과 n2가 같다.");
        } else {

        }
    }
}
