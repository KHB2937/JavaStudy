package oop;

// 메소드
public class Solution3 {
    public static void main(String[] args) {
        Car ferrari = new Car();
        ferrari.name = "페라리";
        ferrari.price = 36000;
        ferrari.introduce();
        Car casper = new Car();
        casper.name = "캐스퍼";
        casper.price = 2000;
        casper.introduce();

        int discountNum = 20;
        // for문을 사용해서 discountNum번의 할인을 진행
        for (int i = 0; i < discountNum; i++) {
            ferrari.discount();
        }
//        ferrari.discount();
        ferrari.introduce();
        System.out.println("ferrari.price = " + ferrari.price);

        // discountPrice라고 하는 변수를 만들고, 그 변수의 값을
        // casper discountTenTimes()라는 메소드의 결과값으로 할당.
        int discountPrice = casper.discountTenTimes();
        System.out.println("discountPrice = " + discountPrice);
        System.out.println("casper.price = " + casper.price);

        System.out.println("--1--");
        casper.price = 2000;
        casper.discountMany(15);
        casper.introduce();
        System.out.println("--2--");
        casper.price = 2000;
        casper.discountMany2(15);
        casper.introduce();
        System.out.println("--3--");
        casper.price = 2000;
        int discountPrice3 = casper.discountMany3(15);
        System.out.println("discountPrice3 = " + discountPrice3);
        casper.introduce();
    }
}
