package oop.part4;

// 다형성 적용을 위한 클래스/인터페이스 응용
public class Solution5 {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        Bouncer bouncer = new Bouncer();
        bouncer.barkAnimal(lion);
        bouncer.barkAnimal(tiger);
    }
}
