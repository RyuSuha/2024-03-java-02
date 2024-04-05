package com.green.day17.ch8;

public class StringToIntStudy {
    public static void main(String[] args) {
        int result = Utils.convertStringToInt("123a");

        System.out.println("result: " + result);
    }



}

class Utils{
    static int convertStringToInt(String str) {
        try {
            int result = Integer.parseInt(str); // 문자열 str을 받아와서 정수 result로 변환, 리턴
            return result;
        } catch (Exception e) { //예외(str에 정수가 아닌 다른게 섞였을때)의 경우에 0으로 리턴
            return 0;
        }
    }
}
