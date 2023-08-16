import java.util.Arrays;

public class Solution4 {
    public static void main(String[] args) {
        // Array
        // (길이가 정해져있는) 0개 이상의 같은 (데이터, 객체) 타입을 공유하는 값들의 묶음(집합)
        // [] : 대괄호, brakets. {}: 중괄호, brace, (): 소괄호, parentheses
        int[] arr = {1, 2, 3, 4, 5}; // 배열 타입 [] (배열 변수의 이름) = { 배열을 구성하는 원소들 }
        // System.out.println("arr = " + arr); // 주소값.
        System.out.println("arr = " + Arrays.toString(arr)); // toString -> 문자열로 보여줄 것인가

        // String Array
        String[] strArr = {"Hello", "World", "Java"};
        System.out.println("strArr = " + Arrays.toString(strArr));

        // 배열의 길이는 고정 (Array)
//        String[] weeks = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        String[] weeks = new String[7]; // 7개의 위치를 가지는 빈 문자열 배열을 만들겠다
        weeks[0] = "Mon";
        weeks[1] = "Tue";
        weeks[2] = "Wed";
        weeks[3] = "Thu";
        weeks[4] = "Fri";
        weeks[5] = "Sat";
        weeks[6] = "Sun";
        System.out.println("weeks = " + Arrays.toString(weeks));
//        String[] weeks2 = new String[]; // java: array dimension missing <- 길이 안줬을 때 에러
        // 길이를 안 주면 new를 통한 생성자로 배열을 생성할 수 없음

        System.out.println("Sat : " +  weeks[5]);

        // 파이썬에서의 길이 : len(...) -> __len__ (List)
        // 자바에서의 길이 : length() <- 오버라이딩. (메소드) (Array, ArrayList)
        // JS : .length 속성. (Array)
        System.out.println("weeks.length = " + weeks.length);

        // 길이가 5인 int array를 정의
        int[] intArr = new int[5];
        // intArr에 0부터 2까지 각각 10, 20, 30의 값을 대입
        intArr[0] = 10;
        intArr[1] = 20;
        intArr[2] = 30;
        // 현재 intArr를 sout한 결과
        System.out.println("intArr = " + Arrays.toString(intArr));
        // 현재 intArr의 length
        System.out.println("intArr.length = " + intArr.length);

        // intArr의 6번째 값을 조회
//        intArr[6] = 100; // ArrayIndexOutOfBoundsException
        // Index 6 out of bounds for length 5
        // intArr의 -1번째 값을 조회
//        intArr[-1] = 100; // ArrayIndexOutOfBoundsException
        // Index -1 out of bounds for length 5
    }
}
