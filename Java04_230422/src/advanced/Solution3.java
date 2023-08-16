package advanced;

public class Solution3 {
    public static void main(String[] args) {
        // static <-> dynamic, instance
        // 객체로서 생성되지 않아도, 클래스 그 자체에 소속되어 실행할 수 있는,
        // # 사용할 수 있는 변수(속성)이나 메소드(함수).
        Gag.print();
        // new라는 키워드로 클래스 생성자를 작동시켜서 변수에 할당
        // 해당 할당된 객체(인스턴스)의 메소드나 속성을 사용.
        // static이라는 걸 사용하면 굳이? 인스턴스에 안 만들어도 그럴 가져올 수 있다.
        // 파이썬의 def한 함수처럼 쓸수 있다.
        // static method (유사하다) -- 파이썬 함수. (일급객체?)

        // + abstract class + static (method/속성) => instance 생성 없이 그냥 써주겠다
        Gag g = new Gag();
        g.print(); // static은 선언되는 순간 고정되어서 그 자체가 메모리에 탑재.
        System.out.println("g.age = " + g.age);
        System.out.println("g.money = " + g.money);
        g.age = 200;
//        g.money = 200;
        System.out.println("g.age = " + g.age);
        g.name = "변영인";
        g.say();
        System.out.println("Gag.age = " + Gag.age);
        System.out.println("Gag.money = " + Gag.money);
        // static <-> 객체, 인스턴스, 저장 되어있는게 X 클래스 기반으로.
        // (클래스이름.속성, 인스턴스.속성)으로 호출하거나 사용.
        // 인스턴스들의 not static한 속성은 개별 귀속이기 때문에
        // A 객체의 속성이 수정되었다고 해도, 같은 타입의 B 객체의 속성이 수정되지 않음.
        // static하다? -> 메모리에 공통관리가 되기 때문에 수정되면은 다른 객체에도 영향 미침.
    }
}
