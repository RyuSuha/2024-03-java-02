package com.green.day16.ch7;


/*
print@@() 는 ()안의 값을 Object가 받고 toString해서 출력한다는 뜻
toString은 Object 클래스의 메소드(문자열을 만드는 기능)
그러므로 println(p) 에서 바로 출력하고싶은 내용을 바꾸려면
toString을 오버라이딩 해서 출력하고 싶은 내용을 작성해야함
ex) 오버라이딩 하는경우 : public String toString () { 내용(문자열) }
 */
public class PolyArgumentTest { //args : arguments (보내는 값,인자,인수)
    public static void main(String[] args) {
        Buyer buyer = new Buyer(20000);
        buyer.buy(new Tv());
        buyer.buy(new Computer());
        buyer.buy(new Sofa()); // Tv Computer Sofa 는 Product를 통해 사용
        buyer.showMeTheMoney(); //haveMoney: ?, haveBonusPoint: ?



        Tv tv = new Tv();
        System.out.println(tv); // Tv price: 100, bonusPoint: 10

        Computer computer = new Computer();
        System.out.println(computer);

        Sofa sofa = new Sofa();
        System.out.println(sofa);




        //Tv 클래스가 Product클래스에 상속받기때문에
        //Product에서 오버라이딩 된 toString사용
//        문제1
//        Product p = new Product(1000);//price = 1000, bonusPoint = 100
//                        // 파라미터값(1000)이 입력된게 Product(생성자)이므로
//                        // Product클래스를 만들고 생성자를 만들어야함(메소드X)
//        System.out.println(p);
//        System.out.printf("price : %d, bonusPoint : %d",
//                p.getPrice(), p.getBonusPoint());


    }
}

class Buyer {
    private int haveMoney;
    private int haveBonusPoint;

    Buyer(int haveMoney) {
        this.haveMoney = haveMoney;
    }
    public int getHaveMoney() {
        return haveMoney;
    }
    public void buy (Product p) {
        this.haveMoney -= p.getPrice();
        this.haveBonusPoint += p.getBonusPoint();
        System.out.printf("%s를 구매하였습니다.\n", p.toString());

    }
    public void showMeTheMoney () {
        System.out.printf("haveMoney: %,d, haveBonusPoint: %,d\n",
                haveMoney, haveBonusPoint);
    }
//    @Override
//    public String toString() {
//        return String.format("haveMoney: %s, haveBonusPoint: %s",
//                haveMoney, haveBonusPoint);


}

class Product {


    private final int price; // final이 붙으면 setter는 사용불가(상수이므로 변동X)
    private final int bonusPoint;

    Product(int price) {
        this.price = price;
        this.bonusPoint = price / 10; // 0.1을 곱하는것과 10으로 나누는것은 다름
                                      // 0.1을 곱하면 데이터타입이 double로 바뀜
    }

    public int getPrice() {
        return price;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }
                                                     //String.format() ()안 내용의 문자열을 만듬
    public String toString() { return String.format( //printf 의 f도 format
            "price: %d, bonusPoint: %d", price, bonusPoint);}


}
class Tv extends Product {
    Tv() {
        super(100);
    }
    @Override
    public String toString() { //Tv 뒤에 Product에서 오버라이드한
                               //toString 내용을 불러오기만 하면 됨
        return String.format("Tv %s", super.toString());
    }
//    @Override
//    public String toString() { return String.format(
//            "Tv price: %d, bonusPoint: %d", getPrice(), getBonusPoint()
//    );}
    // class Tv에서 price와 bonusPoint는 호출 불가(private)
    // 그러므로 리턴값을 받아오는 방식으로 해야함
    // getPrice() , getBonusPoint() 각각 price와 bonusPoint를 리턴받음

}

class Computer extends Product {
    Computer(){
        super(200);
    }

    @Override
    public String toString() {
        return String.format("Computer %s", super.toString());
    }
}
class Sofa extends Product {
    Sofa() { super(80); }
    @Override
    public String toString() {
        return String.format("Sofa %s", super.toString());
    }
}