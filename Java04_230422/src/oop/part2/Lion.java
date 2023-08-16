package oop.part2;

//public class Lion extends Animal {
//}

public class Lion extends Animal implements Predator {
    @Override
    public String getFood() {
//        return "banana";
        return "말고기";
    }
}
