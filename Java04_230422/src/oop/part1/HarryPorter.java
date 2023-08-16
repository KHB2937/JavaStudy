package oop.part1;

public class HarryPorter implements Novel { // implements -> 빈 거 채우기

    @Override
    public void read(int page) {
        System.out.println( "해리포터의 " + page + "쪽을 읽고 있습니다");
    }

    @Override
    public void buy() {
        System.out.println( "해리포터를 구매했습니다");

    }

    @Override
    public void burn() {
        System.out.println( "해리포터를 불태웠습니다");
    }
}
