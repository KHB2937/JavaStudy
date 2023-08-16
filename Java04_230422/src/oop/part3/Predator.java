package oop.part3;

// 인터페이스는 클래스를 상속할 수 X. 인터페이스끼리는 상속이 가능함

public interface Predator {
    String getFood(); // 인터페이스에게 구현을 해야하는 getFood라고 하는 메소드를 부여
    // String이 Return값의 타입
    // -> getFood의 결과값이 String이 나오도록 구현을 해야한다
}
