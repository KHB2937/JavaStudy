package flow_control;

public class Solution1 {
    public static void main(String[] args) {
        // if 조건문
        int age = 20;
        // age에다가 random하게 1과 100 사이의 값을 대입
        age = (int) (Math.random() * 100) + 1;
        // System.out.println("age = " + age);
        // if (age >= 20) {
        //     System.out.println("adult");
        // }
        System.out.println("age = " + age);
        if (age >= 60) {
            System.out.println("you are old");
        } else if (age >= 20) { // 소괄호(parentheses_
            System.out.println("you are adult");
            // 중괄호(brace)로 조건을 만족했을 때 실행할 코드들의 묶음을 표현한다.
        } else if (age >= 13) {
            System.out.println("you are teenager");
        } else {
            System.out.println("you are not adult");
        }
        /*
        * if 조건: # 조건 만족? condition -> 결과가 boolean 표현되는 리터럴 값 또는 변수 또는 호출된 함수...
        *   실행문 # 들여쓰기(indent)로 조건문 블록의 시작과 끝을 표시
        * */
        // if, else, elif -> python
        // if, else, else if -> java

        // https://www.phind.com/search?cache=c76d3127-caae-488d-ae15-8f6e20632ce0
    }
}
