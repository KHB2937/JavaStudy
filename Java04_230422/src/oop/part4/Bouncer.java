package oop.part4;

public class Bouncer { // 경비원 클래스
//    void barkAnimal(Animal animal){ // Animal 타입의 클래스.
    void barkAnimal(Barkable animal){ // Barkable 타입의 클래스.
        // bark = 기능. 메소드들.
        // * A instanceof B
        // * ㄱ IS-A ㄴ 관계 : ㄱ이 ㄴ의 일부인가? 변종인가? 자식 클래스인가?
        // 경비원 -> Animal을 사용해서 짖게 만들기
        // A instanceof B : B는 A이거나, 혹은 A의 자식 클래스인가?
        // animal이 Animal은 Object의 직계자손
//        if (animal instanceof Tiger) {
//            Tiger tiger = (Tiger) animal;
//            // Tiger라는 타입인지를 이미 instaceof로 변환 가능 여부를 체크
//            System.out.println("어흥");
//        } else if (animal instanceof Lion) {
//            System.out.println("엄마 돈 줘");
//        }
//        if (animal instanceof Bird) { // 변환할 수 없는 타입
        // Animal animal은 Bird로 바뀔 수가 없음
        // animal instanceof ...? => 형변환 시도 (type cast, tpy casting)
//        }
        System.out.println("Bouncer.barkAnimal");
        animal.bark();
    }
}
