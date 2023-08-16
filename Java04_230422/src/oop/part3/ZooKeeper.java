package oop.part3;

public class ZooKeeper {
    // feed(Tiger tiger)
//    void feed(Tiger tiger) { // 호랑이가 오면 사과를 던져준다
//        System.out.println("feed apple");
//    }
//
//    void feed(Lion lion) { // 사자가 오면 바나나를 던져준다
//        System.out.println("feed banana");
//    }

    // 오버 로딩의 장점 : 굳이 if문이나 그런거 필요없이, 메소드 자체로 분기 가능하다
    // 오버 로딩의 문제? : 1. 귀찮다 - 타입 추가 시 무조건 1개 이상의 메소드가 증가
    // 2. 반복적으로 등장하는 부분에 대한 패턴화가 어렵습니다.

    // 상위를 의미하는 인터페이스를 타입을 집어놓고 처리
    void feed(Predator predator) {
        // 분류를 하기 위한 predator를 추가
        // -> 분기가 안 되요
//        System.out.println("feed grape");
//        System.out.println("feed " + predator.getFood());
        System.out.println(predator.getFood() + "을/를 먹이로 주었습니다");
    }
}
