package access;

// Public으로 구현. 모든 곳에서 접근 가능.
public class MyPublic {
    public String msg;
    public MyPublic(String msg) {
        this.msg = msg;
    }
    public void print() {
        System.out.println(msg);
    }
}
