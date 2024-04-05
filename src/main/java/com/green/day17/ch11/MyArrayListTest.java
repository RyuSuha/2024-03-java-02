package com.green.day17.ch11;


public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
//        List<Integer> list = new MyArrayList();
        //arr 기존 크기보다 1칸 더 큰 새로운 배열 만들고
        //그 배열 마지막 칸에 넘어온 파라미터값을 집어 넣는다.
        //새로운 배열의 주소값을 전역변수 arr에 대입한다.

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);



        System.out.println(list); // [10, 20]
        int size = list.size(); //9
        System.out.println("size: " + size);
        System.out.println(list.get(3)); // 40
        System.out.println(list.get(0)); // 10
    }
}

class MyArrayList { //위에서 기본생성자를 호출했으므로 기본생성자 생성
    private int[] arr ;

    MyArrayList() {
        this.arr = new int[0]; // new int[n] : arr은 n개만큼의 갯수를 가진 배열
    }

    void add(int val) {
        int[] tmp = new int[arr.length + 1];
        tmp[arr.length] = val; // 나 자신의 length에서 -1 하면 항상 마지막 칸
        for(int i=0; i<arr.length; i++) {
            tmp[i] = arr[i];
        }

        arr = tmp;

    }
    @Override
    public String toString() {
        if(arr.length == 0) {            return "[]" ;}
        StringBuilder sb = new StringBuilder(String.format("[%d", arr[0]));
        for(int i=1; i<arr.length; i++) {
            sb.append(String.format(", %d", arr[i]));
        }
        sb.append("]"); // append 덧붙이다 (문자열에서 + 와 같음)
        return sb.toString();
    }

    int size() {
        return (arr.length);
    }

    int get(int m) {
        return arr[m];
    }

    void showLength() {
        System.out.println("len : " + arr.length);
    }



}