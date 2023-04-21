package flow_controll;

public class Solution1 {
    public static void main(String[] args) {
        // if 조건문
        // if conditional statement
        int score = 85;
        if (score >= 90) {
            System.out.println("A");
        }
        if (score >= 90) System.out.println("A"); // 세미콜론 1로 끝낼 수 있으면 {} 안써도 됌
        // {} -> 어떠한 흐름제어나 메소드, 클래스 등의 여러 기능 정의 -> 2개 이상의 ; 등으로 구성된 실행문들을 통합
        // if, else, else if.
        // CASE a
        if (score >= 70) {
            System.out.println("A");
            // 먼저 등장하여서 조건을 만족시켰을 경우, 그 이후 실행되는 else if들은 모두 무시
        } else if (score >= 80) {
            System.out.println("B");
        }
        // CASE b
        if (score >= 70) {
            System.out.println("A");
        }
        if (score >= 80) {
            System.out.println("B");
        }

        // else
        if (score > 100) {

        } else {
            System.out.println("C");
        }
    }
}
