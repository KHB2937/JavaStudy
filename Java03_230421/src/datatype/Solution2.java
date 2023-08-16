package datatype;

public class Solution2 {
    public static void main(String[] args) {
        // Type Casting
        // 1. 내장 메소드 혹은 외장 함수
        // Integer.parseInt("123");
        String str = "123";
        int num = Integer.parseInt(str); // Wrapper Class
        System.out.println("num = " + num);
        // from A to B
        // from int to string
        String str2 = String.valueOf(num);
        System.out.println("str2 = " + str2);
        // use toString()
        String str3 = new Integer(num).toString();
        str3 = num + ""; // python? 에러남. java -> 형 변환.
        // 원시타입형(class가 없는 애들, int, double...) -> "" (빈 문자열 리터럴) + 연결 => 문자열 형 변환
        System.out.println("str3 = " + str3);
        // 2. 직접 타입 지정하기
        double num2 = 3.14;
//        int num3 = num2; // double (소수점) -> int (소수점 X)
        int num3 = (int) num2; // double -> int
        System.out.println("num3 = " + num3);
    }
}
