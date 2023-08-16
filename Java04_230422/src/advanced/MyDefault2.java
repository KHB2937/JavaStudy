package advanced;

// Default <- protected랑 크게 다르지 않음. protected <- 상속받아가면 작동 가능.
class MyDefault2 {
    String msg;
    MyDefault2(String msg) {
        this.msg = msg;
    }
    void print() {
        System.out.println(msg);
    }
}
