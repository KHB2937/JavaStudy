package oop;

// 물려받으면 -> 거기서 끝나는게 아니라 바꿔쓰거나 더 보강해서 쓰잖아요?
// class ActionMovie(Movie):
public class ActionMovie extends Movie { // extends -> 상속을 받아와서 보강해서 쓰겠다
    // name, hour, actor - 멤버변수
    // intro - 메소드
    void bang() {
        System.out.println("bang bang");
    }
}
