package oop;

public class Solution2 {
    public static void main(String[] args) {
        // novel 생성
//        Novel novel = new Novel(); -> 생성할 수 없는, 정의(definition)으로만 구성된 클래스 일종
//        Novel novel = new HarryPorter("해리포터");
//        // Novel : 타입을 Novel로 줬어요.
//        novel.burn();
//        novel.buy();
//        novel.read(100);
        getNovel(new HarryPorter());
        getNovel(new Rings());
    }

    public static void getNovel(Novel novel) {
        novel.info();
        novel.buy();
        novel.read(100);
        novel.burn();
        // 이런식으로 구현할 겁니다 -> HarryPorter, Rings... -> 말로만 하면?
        // 실수나 누락이 있을 수밖에 없음.
        // Interface로 작성해서 넘긴다음에 implements
    }
}
