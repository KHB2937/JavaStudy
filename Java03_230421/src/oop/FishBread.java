package oop;

public class FishBread {
    // 붕어빵 안에 '이름'이라는 '속성'을 넣으면 되지 않을까?
    // '속성' == '변수' -> 객체나 클래스에 소속된 변수
    String name; // 변수를 선언. // 타입과 변수 이름. => 선언.
    // 객체에게 속한 변수. <객체 변수. *멤버 변수. 인스턴스 변수. 속성>

    // setName <- 카멜케이스.
    void setName(String name) { // 매개변수? 패러미터?
        // 매개변수를 통해서 전달 받은 '값' => 인자.인수. arguments
        this.name = name; // 파이썬에서 뭘까? : self.
        // this??? : 객체 자신.
    }
}
