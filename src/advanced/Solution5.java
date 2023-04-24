package advanced;

// lambda <- Java 8. (1.8)
public class Solution5 {
    // lambda : Anonymous function (익명함수)
    public static void main(String[] args) {
//        MyCalculator mc = new MyCalculator();
        Calculator mc = new MyCalculator();
        int result = mc.sum(7, 12);
        System.out.println(result);
        // Sum을 구현해야하는 상황이었기 때문에 자바의 람다식을 넣어서 구현
        Calculator mc2 = (int a, int b) -> a + b;
        // 파이썬과 비슷함 lambda a, b: a + b
        int result2 = mc2.sum(7, 12);
        System.out.println("result2 = " + result2);
        Calculator mc3 = (a, b) -> a + b; // 타이핑을 지워도 됨. 왜? 이미 인터페이스가 강제했으니까.
        // 파이썬과 비슷함 lambda a, b: a + b
        int result3 = mc3.sum(7, 12);
        System.out.println("result3 = " + result3);
//        Integer.sum(int a, int b)
        // 파이썬과 비슷함 lambda a, b: a + b
        Calculator mc4 = Integer::sum; // 클래스명::함수명으로 익명함수 람다식 호출 가능.
        int result4 = mc4.sum(7, 12);
        System.out.println("result4 = " + result4);
        // https://wikidocs.net/157858
        // 자바와 파이썬 사이의 람다식 사용의 차이.
    }
}

interface Calculator {
    int sum(int a, int b);
} // 2개의 값을 받아서 (합) -> 어떠한 계산

class MyCalculator implements Calculator { // Interface
    @Override
    public int sum(int a, int b) {
        return a + b;
    }
}