package flow_control;

public class Solution4 {
    public static void main(String[] args) {
        // for 문
        // 파이썬 -> 향상 for문 혹은 for each.
        // 다양한 치즈의 종류를 for문으로 출력
        String[] cheese = {"cheddar", "gouda", "edam"
                , "provolone", "parmesan"};
        for (int i = 0; i < cheese.length; i++) { // C언어스러운 방식
            // for (...) : -> 이 반복문이 한 번씩 반복될 때 어떠한 작업을 할 것인지 정의
            // 1 : 초기식 -> 특정한 이름의 반복되어 바꿔질 변수를 초기화하는 단계. (i -> 0)
            // 2 : 조건식 -> 언제까지 반복할 건데? => i < (배열이나 리스트).길이 혹은 특정한 값 (10, 20...)
            // 3 : 증감식 -> i => 커지거나 작아짐. ++ --. +=, -= 2씩, 3씩...
//            System.out.println(cheese[i]); // 실행문.
            System.out.println(i + " " + cheese[i]); // 실행문.
            // python -> range. (시작값, 종료값, 증가하는 값)
        }
        System.out.println();
        // 뒤집을 때
        for (int i = cheese.length - 1; i > -1; i--) {
            // 시작을 맨 마지막 인덱스 (length -1)
            // i가 -1보다 클 때 (i >= 0)
            // i-- => -1씩 작아지는 방향으로 반복문을 전개시키겠다
            System.out.println(i + " " + cheese[i]); // 실행문.
        }
        // break, continue.
        // 이중 포문...

        // java에서의 for문을 익힐 때 (for each문 아님)
        // continue와 break에 익숙해질 수 있는 예제 코드 5개를 줘.
        // 그리고 해당 코드들은 핵심적인 부분들을 빈칸처리한 것과,
        // 해석이 포함된 것 버전을 나눠서 제시해줘.
        // https://sharegpt.com/c/YWNIvGe

        // java에서의 for문을 익힐 때 (for each문 아님)
        // continue와 break에 익숙해질 수 있는 예제 코드 5개를 줘.
        // 그리고 해당 코드들은 핵심적인 부분들을 빈칸처리한 것과,
        // 해석이 포함된 것 버전을 나눠서 제시해줘. 파이썬에서 같은 코드를 구현했을 때의 예시도 포함해줘.
        // https://sharegpt.com/c/qm5Fb4v

        // Java에서 for문 또는 이중 for문을 사용해서 별 찍기하는 코드를
        // 각기 다른 3가지의 코딩 스타일로 예제 코드와 함께 보여줘.
        // 각각 예제코드는 자세한 주석이 포함되어 있고, 파이썬 코드도 같이 들어 있어야해.
        // https://sharegpt.com/c/vrBOJjb

        // for each : 향상된 for문. 파이썬 for문
        // for <변수명> in <순서가 있는 데이터 묶음>:
        for (String s : cheese) { // for ((불러올 변수의 타입) <변수명> : <순서가 있는 데이터묶음>) {실행문}
            System.out.println(s); // 인덱스를 X
            // 방향 조절 X.
            // 코드가 무척 간격 + 파이썬과 for문이 유사해짐.
            // 파이썬은 언팩킹. / 자바 언팩킹 X.
            // 파이썬 -> 컴프리헨션. / 자바 -> 스트림.
        }

        // 연습문제 : https://wikidocs.net/157996
        // GPT로 문제 만들기 : https://sharegpt.com/c/mYkFFYV
    }
}
