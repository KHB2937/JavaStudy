package advanced;

public class Gag {
    public static void print() {
        System.out.println("왕이랑 작별인사하면 바이킹");
        // parameter를 쓰지 않는 이상, 고정된 값으로만 처리.
        // 인스턴스 메소드, 속성들은 변할 수 있는데 얘는 새로운 변화된 값에 대응되서 값이 변하지 X
    }

    public String name;
//    public static int age; // 0
    public static int age = 100;
    public final static int money = 100; // final 합쳐지면?

    public void say() {
        System.out.println(name + "은 정말 웃기다");
    }
}
