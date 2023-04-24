package oop.part4;

//public class Lion extends Animal {
//}

//public class Lion extends Animal implements Predator, Barkable {
public class Lion extends Predator implements Barkable { // Predator를 Animal을 상속하는 Abstract Class화를 해서 처리
    @Override
    public String getFood() {
//        return "banana";
        return "말고기";
    }

    @Override
    public void bark() {
        System.out.println("나는 밀림의 왕 사자다");
    }
}
