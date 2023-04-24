package oop;

public class Rings implements Novel {

    @Override
    public void info() {
        Novel.super.info(); // 상속해서 사용해주겠다
        System.out.println("이건 짱짱 소설이니까 꼭 읽으라구!");
    }

    @Override
    public void read(int page) {
        System.out.println(page + "쪽이긴 한데 어쩔?");
    }

    @Override
    public void buy() {
        System.out.println("사지마... 빌려봐...");
    }

    @Override
    public void burn() {
        System.out.println("불타오른다아아아!");
    }
}
