package datatype;

public class Solution7 {
    public static void main(String[] args) {
        // 변수 (변할 수 있는 값)
        int score = 100;
        score = 50;
        System.out.println("score = " + score);
        // 상수 (항상 그 값인 변수)
        // --
        // 변수는 원래 2단계 -> 선언부 (타입과 변수명), 대입부 (값)
        // => 초기화 => 재선언 X. 재대입 O.
        // 상수는 선언, 대입, => 재선언 X. 재대입(할당) X.
        final int SCORE = 100;
//        SCORE = 150; // java: cannot assign a value to final variable SCORE
        System.out.println("SCORE = " + SCORE);
        // const (상수), final (상수)
        // 1. java : final, python : final
        // 2. js : const. (ecma6) = java fina
        // 3. dart : final (객체-선언부, 대입부. -> 런타임)
        //           const (초기화-컴파일할 때 이미 고정시켜버리는 값)
    }
}
