package com.green.day16.ch7;
//p.348 접근 제어자
public class TimeTest {
    public static void main(String[] args) {
        Time time = new Time( 10, 11, 12);
        System.out.printf("hour: %d\n", time.getHour());
        System.out.printf("%02d : %02d : %02d\n", time.getHour(), time.getMinute(), time.getSecond());
        time.setHour(22);
        System.out.printf("hour: %d\n", time.getHour());
        time.setHour(23);
        time.setMinute(30);
        time.setSecond(54);
        System.out.println(time);
        System.out.printf("time is %02d:%02d:%02d", time.getHour(), time.getMinute(), time.getSecond());
    }
}

class Time { //캡슐화, 은닉화
    private int hour; //상속을 할 예정이면 protected사용
    private int minute;//private는 상속불가
    private int second;
    // private 멤버필드에 값 넣는법 : 최초에 생성자를 통해, setter를 통해
    // 값 빼는법 : getter를 통해

    Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    //get멤버변수이름 > 멤버변수의 값을 읽는 메서드(getter)
    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }
    public int getSecond() {
        return second;
    }

    //set멤버변수이름 > 멤버변수의 값을 변경하는 메서드(setter)
    public void setHour(int hour) {
        this.hour = hour;
    }
    public void setMinute(int minute) {
        this.minute = minute;
    }
    public void setSecond(int second) {
        this.second = second;
    }
    public String toString() {
        return String.format("time is %02d:%02d:%02d\n", hour, minute, second);

    }

}