package oop;

public class Solution2 {
    public static void main(String[] args) {
        // novel 생성
//        Novel novel = new Novel(); -> 생성할 수 없는, 정의(definition)으로만 구성된 클래스 일종
        Novel novel = new HarryPorter("해리포터");
        // Novel : 타입을 Novel로 줬어요.
        novel.burn();
        novel.buy();
        novel.read(100);
    }
}
