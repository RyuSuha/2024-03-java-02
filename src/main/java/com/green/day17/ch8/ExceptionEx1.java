package com.green.day17.ch8;

public class ExceptionEx1 {
    public static void main(String[] args) {
        try {
            System.out.println("----시작----");
            int a = 10;
            int b = 20;
            //int c = 10 / 0;
            throw new Exception(); //일부러 예외를 발생시킴
        } catch (ArithmeticException e) {
            System.out.println("수학적 예외 발생!!!"); //~exception은 모두 Exception에 상속됨
        }                                           //그러므로 다른 ~ex보다 가장 아래에 있어야함
        catch(Exception e) {                        //catch로 예외를 잡아낼때는
            e.printStackTrace();                    //위에서 예외가 발생했을 경우 아래는 처리안함
            System.out.println("예외 발생!!");
        } finally {
            System.out.println("finally"); //finally : 예외가 생기든 안생기든 반드시 실행됨
        }
        System.out.println("----종료----");
}

}
