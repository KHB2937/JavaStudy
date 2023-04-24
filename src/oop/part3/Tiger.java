package oop.part3;

// 상속은 한쪽 방향으로, (부모 클래스 -> 자식 클래스) 1개만 가능
// Interface 상속을 했을지라도 추가적으로 적용
// public class Tiger extends Animal {
//}

// implements : 2개 이상의 Interface를 적용
public class Tiger extends Animal implements Predator {
    @Override
    public String getFood() {
//        return "apple"; // apple값을 리턴 (ZooKeeper.feed -> Tiger -> Tiger.getFood -> apple)
        return "닭고기";
    }
    // Predator라는 Inteface 때문에 구현해야할 getFood라는 메소드 생겨서

}