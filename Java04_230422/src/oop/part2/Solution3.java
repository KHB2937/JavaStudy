package oop.part2;

// 다형성 적용을 위한 클래스/인터페이스 응용
public class Solution3 {
    public static void main(String[] args) {
        ZooKeeper keeper = new ZooKeeper(); // 사육사 객체 생성
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        keeper.feed(tiger); // feed apple
        keeper.feed(lion); // feed banana
    }
}
