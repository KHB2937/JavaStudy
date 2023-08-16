package oop.part4;

// abstract class
//public interface Predator {
//    String getFood(); // 인터페이스에게 구현을 해야하는 getFood라고 하는 메소드를 부여
//    // String이 Return값의 타입
//    // -> getFood의 결과값이 String이 나오도록 구현을 해야한다
//}

// 추상 클래스
// 클래스 -> 생성이 안되는 클래스 (인터페이스랑 유사)
// + 멤버변수를 가질 수 있다
// UML -> Class Diagram, Sequence Diagram?
abstract class Predator extends Animal { // 이미 존재하는 클래스를 상속 받을 수 있음
//    String getFood(); // 인터페이스의 문법
    abstract String getFood(); // 추상 클래스도 클래스라, abstract 키워드를 안 붙혀주면 {}로 채워줘야함
    // 기본적으로는 interface default 메소드 옵션이다.

    void printFood() { // default를 붙이지 않아도 그냥 구현.
        System.out.println("my food is " + getFood());
    }
}
