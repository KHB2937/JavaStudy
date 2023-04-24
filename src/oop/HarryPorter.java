package oop;

public class HarryPorter implements Novel { // implements -> 빈 거 채우기
    String title;

    HarryPorter(String title) {
        this.title = title;
    }

    @Override
    public void read(int page) {
        System.out.println( title + "의 " + page + "쪽을 읽고 있습니다");
    }

    @Override
    public void buy() {
        System.out.println( title + "를 구매했습니다");

    }

    @Override
    public void burn() {
        System.out.println( title + "를 불태웠습니다");
    }
}
