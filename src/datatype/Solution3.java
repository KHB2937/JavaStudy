package datatype;

import java.util.ArrayList;

public class Solution3 {
    public static void main(String[] args) {
        // 상수 -> 항상 그 값인 (변)수. 유지되는 것.

        final int NUM = 10; // 상수는 다 대문자로 표시 -> 변수 명으로 특징 알려줌.
        // 일반적인 변수들은 -> CamelCase -> myName / TEACHER_NAME (대문자형 스네이크)
        // https://goni95.tistory.com/167

        System.out.println(NUM); // 다시금 할당이나 대입이 안 됨.

        // 자바에서 (일반적인 프로그래밍에서) 변수가 생성되는 과정
        // 1. 선언 : 나는 (특정한 타입의) 어떠한 이름을 가진 변수 자리를 (메모리에) 만들겠어
        // 1-1. 재선언 X (특정한 블록 -> 들여쓰기나 {} 형태 범위를 의미)
        // 2. 할당 또는 대입 : 나는 ~한 이름을 가진 변수에 ~한 값을 넣겠어.
        // 2-1. (타입을 만족시킨다면) 새로운 값을 무제한적으로 넣을 수 있음.
        // 3. 초기화 (선언 -> 대입) : (특정한 타입의) 어떠한 이름을 가지는 변수 자리를 만들고 그 자리에 바로 값을 넣겠어

        // 선언만 되어 있을 때는 무엇일까?
        // 자리만 있음. -> (자리는 있는데 비어있다) -> Null, None, Void.
//        String place;
        String place = null; // 비었다는 의미의 null로 강제로 할당이나 대입이 가능.
        System.out.println("place = " + place); // NullPointerException

        // 상수(final)는... '재할당' 개념이 없음
//        NUM = 20; // java: cannot assign a value to final variable NUM

        // 1. 실수 방지 -> 바뀌지 않아야하는 것들. 
        // 2. 성능 향상 -> 변할 수 있다는 건 계속 신경쓰고 용량/성능을 잡아먹는다
        // 근데 final을 주면? -> 안 변한다. -> 주소값이 고정.
        // 변수 이름 -> 메모리상의 (RAM 상의) 임시저장되어 있는 어떠한 데이터 위치.
        // final -> 주소값 고정 -> 번호 이동 X. 이사를 다니지 않는 사람.
        
        final ArrayList<String> arr = new ArrayList<>();
        arr.add("hello");
        System.out.println("arr = " + arr);
        arr.set(0, "bye");
        System.out.println("arr = " + arr);
    }
}
