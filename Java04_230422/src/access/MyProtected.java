package access;

// class는 접근자로 default, public
// Protected : 동일 패키지의 클래스 또는 해당 클래스를 상속받은 다른 패키지의 클래스에서만 접근이 가능
public class MyProtected {
    protected String msg;

    protected MyProtected(String msg) {
        this.msg = msg;
    }

    protected void print() {
        System.out.println(msg);
    }
}
