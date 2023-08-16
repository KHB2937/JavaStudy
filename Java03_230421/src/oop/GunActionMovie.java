package oop;

public class GunActionMovie extends ActionMovie {
    String gunName;
    @Override
    void bang() { // 부모클래스에게 물려받은 (이미 정의되었던)
        // 메소드를 재정의해서 다르게 사용하는 것 => 메소드 오버라이딩
        System.out.println("gunName = " + gunName);
        super.bang(); // 부모클래스에 이미 정의된 기능을 불러오겠다
//        System.out.println
    }
    // cf. 오버라이딩 vs 오버로딩
    // 오버라이딩 -> (부모클래스에서 이미 정의된) 상속을 받은 메소드를, (이름과 패러미터가 같은 상황에서) 다른 내용으로 바꾸는 것
    // 오버로딩 -> 이름은 같은데, 패러미터가 다른 유사한 메소드들.
}
