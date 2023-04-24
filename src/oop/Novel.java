package oop;

public interface Novel {
    // 인터페이스

    // 메소드 정의 시에 블록 즉, 구현 상태가 아니어도 됨.
    void read(int page);
    void buy();
    void burn();

    default void info() { // 1.8 <- 상속처럼 쓸 수 있다 <-
//        System.out.println("이것은 소설입니다");
        System.out.println("이것은 Social입니다");
    }
}
