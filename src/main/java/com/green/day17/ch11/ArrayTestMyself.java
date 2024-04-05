package com.green.day17.ch11;

public class ArrayTestMyself {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(34);
        list.add(45);
        list.add(56);
        list.add(67);

    }
}

class ArrayList {
    private int[] arr;

    ArrayList() {
        this.arr = new int[0]; //arr은 방이 0개인 배열(아무것도 없음)
    }

    void add(int val) { //main메소드에서 add를 사용하기위해 add 메소드를 작성 해야함
        int[] tmp = new int[arr.length + 1]; // 배열 tmp는 방이 (arr.length+1)개 이다.
        tmp[arr.length] = val; //tmp배열의 arr.length번 방의 값은 val이다.
        for(int i=0; i<arr.length; i++) {
            tmp[i] = arr[i]; //i가 arr.length보다 작을때, tmp의 i번째방의 값은 arr의 i번째 방의 값과 같다.
            //이 for문이 필요한 이유는 아무것도 없는 상태에서 list.add(34)를 실행시키면
            //arr.length = 0 (처음엔 아무배열이 없기때문에) 이고 tmp = int[1] (0+1)이 된다.
            //tmp는 1개의 방(0번방)을 가진 배열이 되고, 다음줄에서
            //tmp[0] = val(34) 이므로 tmp의 0번방에 34라는 값이 복사된다.
            //그리고 난 뒤 for문은 스킵(조건식 불만족)되고 arr = tmp이므로
            //배열 arr은 1개의 방을 가졌고 그 방(0번방)의 값은 34이다.
            //여기서 두번쨰 list.add(45)를 실행시키면 arr.length = 1 (1개의 방을 가지고있으므로)
            //tmp = int[2] (1+1)이 되고 2개의 방을 가진 배열이 된다.(0번방 , 1번방)
            //tmp[1] =  val(45) 이므로 tmp의 1번방에는 45라는 값이 복사된다.
            // !!!! 여기서 tmp의 0번방에는 값이 0이다.
            // tmp의 텅빈 2개짜리 방의 2번째 방에만 45라는 값이 복사되었기 때문
            // ex) 0번방 : 0 / 1번방 : 0 >> timp[1] = val(45) >> 0번방 : 0 / 1번방 : 45
            //여기서 0번방에 처음에 넣었던 34를 다시 넣기위해 for문 사용
            //i=0 이므로 tmp[0] = arr[0]이고, arr[0]은 첫 실행때 34가 되었다.
            //그러므로 for문이 끝나면서 tmp의 0번방이 0에서 34로 복사되었다.
            //그후에 arr = tmp 를 적용시키면
            // 배열 arr은 0번방에 34, 1번방에 45라는 값이 든 방 2개짜리 배열이 되는것이다.

        }
        arr = tmp;
    }
}
