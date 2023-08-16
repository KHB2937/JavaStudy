package advanced;

public class Solution4 {
    // 예외처리
    public static void main(String[] args) {
        // try, except : python
        // try, catch : java
        // 무슨 차이인가?

        try {
            int[] arr = new int[5]; // 0~4까지의 인덱스
            arr[5] = 10;
            // 발생할 수 있는 오류의 가짓수만큼 catch를 무한적을 붙일 수 있음.
        } catch (RuntimeException e) {
            System.out.println(e);
//        } catch { // 파이썬처럼 except하나만 넣어서 처리
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("My Custom Exception");
        // 예) 4자리 숫자 계산을 해야하는데 5자리 숫자를 넣었을 때
        // 일부러 throw을 통해서 (raise) 나의 커스텀 에러를 발생시켜서 흐름을 끊고,
        // 대신 그 외부에 catch문을 둬서 마치 조건 처리 (else if) 효과를 줘요.
        try {
            // throw 에러처리
            // ... 뭔가 잘못된 입력이 감지가 되면
            throw new MyException("ㅇ_ㅇ");// raise
        } catch (MyException e) { // 나의 예외처리
            System.out.println(e);
            // Exception을 만들었을 때 Msg나 기타 필요한 값들을 새롭게 정의시켜서 사용할 수 있음
        }
    }
}
