package oop;

public class Car {
    String name; // 멤버변수 name <- 문자열
    int price; // 멤버변수 price <- 정수

    // 입력 X : 매개 변수가 없다. 외부에서 전달 받을 내용. 이미 작업이 다 정해져있거나
    // 출력 X : return 없거나, return에 뭔가 안 붙었을 때
    // 메소드에서 어떤 변수를 찾을 때
    // 1. 매개변수
    // 2. 멤버변수 <- 매개변수와 멤버변수 간의 이름 중복이 없다? this 안써줘도 됨
    void introduce() { // 자기 소개
        System.out.println("이 차의 이름은 " + name + "입니다");
        // 조건문 : this.price가 10000 이상이라면 '억원'으로 표시
        if (this.price >= 10000) {
            int firstNumber = this.price / 10000; // 억원.
            int secondNumber = this.price % 10000; // 만원.
            System.out.println(
                    String.format("이 차의 가격은 %d억 %d만원입니다",
                            firstNumber, secondNumber)
            );
            return; // 더 이상 뭐 하지마.
        } // else 연결하는 방법도 있음.
        System.out.println("이 차의 가격은 " + price + "만원입니다");
        return; // return : 함수가 종료.
    }

    // 할인
    void discount() {
        this.price = this.price * 90 / 100; // 10% 할인.
        // this.price에 할인한 가격을 다시 저장.
    }

    // 입력이 없고, 결과만 있는.
    // 10번 할인했을 때의 가격을 알려주는. + 원본 가격에는 영향 X
    int discountTenTimes() {
        int discountNum = 10;
        // for문을 사용해서 discountNum번의 할인을 진행
        int discountPrice = this.price; // 원래 가격.
        // 멤버변수를 받아오기만 했지. 다시 저장하는 일 X.
        // int같은 원시자료형은 주소값 X. 얕은 복사 X.
        for (int i = 0; i < discountNum; i++) {
//            discountPrice = discountPrice * 90 / 100;
            discountPrice *= 90;
            discountPrice /= 100;
        }
        return discountPrice;
    }
    // 입력은 X. 출력만 있는데. 그 출력은 내부에 있는 멤버 변수를
    // 통해 계산한 값. -> 그 멤버 변수를 다시 저장? 안했어.

    // 입력은 있는데 출력은 없음.
    void discountMany(int times) { // 몇번 할인을 할 것인가?
//        int discountNum = 10;
        // for문을 사용해서 discountNum번의 할인을 진행
        int discountPrice = this.price; // 원래 가격.
        // 멤버변수를 받아오기만 했지. 다시 저장하는 일 X.
        // int같은 원시자료형은 주소값 X. 얕은 복사 X.
        for (int i = 0; i < times; i++) {
//        for (int i = 0; i < discountNum; i++) {
//            discountPrice = discountPrice * 90 / 100;
            discountPrice *= 90;
            discountPrice /= 100;
        }
        System.out.println("discountPrice = " + discountPrice);
        this.price = discountPrice;
//        return discountPrice;
    }

    void discountMany2(int times) { // 몇번 할인을 할 것인가?
        for (int i = 0; i < times; i++) discount();
        System.out.println("discountPrice = " + this.price);
    }

    int discountMany3(int times) { // 몇번 할인을 할 것인가?
        for (int i = 0; i < times; i++) discount();
        return this.price;
    }
}
