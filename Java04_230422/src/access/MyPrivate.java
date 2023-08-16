package access;

// Private으로 구현. 같은 클래스 내에서만 접근 가능
public class MyPrivate {
    private String msg;
    private MyPrivate(String msg) {
        this.msg = msg;
    }
    private void print() {
        System.out.println(msg);
    }
}
