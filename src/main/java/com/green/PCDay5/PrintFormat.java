package com.green.PCDay5;

public class PrintFormat {
    public static void main(String[] args) {

        //%d > 정수 : byte, short, int, long
        //%s > 문자열 : String, "직접 작성한 값"
        //%f > 실수 : float, double (소숫점)
        //%c > 문자 : char

        //%b > 불린 : boolean


        char c = 'A';
        int finger = 10;
        //리터럴 정수는 int타입
        //long타입 리터럴로 변경하려면 끝에 1, L 붙이면 된다.
        long big = 1_000_000_000L;

        System.out.printf("c=%c, %d\n", c, (int)c); // 왜 65가 나오나
        System.out.printf("finger=[%5d]\n", finger);
        System.out.printf("finger=[%-5d]\n", finger);
        System.out.printf("finger=[%05d]\n", finger);
        System.out.printf("big=%,d\n", big);

        //yyyy-mm-dd
        int year = 2024;
        int mon = 2;
        int day = 2;
        System.out.printf("%4d-%02d-%02d\n", year, mon, day);

        String ur1 = "www.green.com";
        float f1 = .10f; //0.10f와 동일
        //리터럴 실수는 double타입,
        //끝에 f or F를 붙이면 float타입의 리터럴이 됨
        double d = 1.23556789;

        System.out.printf("ur1=%s\n", ur1);
        System.out.printf("f1=%f\n", f1);
        System.out.printf("d=%f\n", d);
        System.out.printf("d=[%.2f]\n", d); //반올림 처리 됨
        System.out.printf("d=[%10.2f]\n", d); //반올림 처리 됨
        System.out.printf("d=[%010.2f]\n", d); //반올림 처리 됨
        System.out.printf("d=[%-25.20f]\n", d);
        // % -20 . 20f
        // -20 은 양수일경우 좌측으로부터 전체 글자수 음수일경우 우측으로부터 전체 글자수
        // .20 은 소숫점 아래 표기 수

        System.out.printf("[%s]\n", ur1);
        System.out.printf("[%20s]\n", ur1);
        System.out.printf("[%-20s]\n", ur1);
        System.out.printf("[%.8s]\n", ur1); //왜 gree 까지만 출력되는가




    }
}
