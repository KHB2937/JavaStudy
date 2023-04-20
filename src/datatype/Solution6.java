package datatype;

public class Solution6 {
    public static void main(String[] args) {
        // Type Casting (형 변환)
        // 1. 메소드를 사용한 방식
        // String to int
        String str = "100";
        System.out.println("str = " + str);
        // str의 타입 확인
        System.out.println("str.getClass() = " + str.getClass());
        // getClass -> 타입 확인
        int num = Integer.parseInt(str); // parsing - 분석.
        // int wrapper -> wrap -> primitive(원시형) -> 메소드나 속성X -> 도우미.
        System.out.println("num = " + num);
        // num의 타입 확인

        // "100" parseint -> 100
        // 1. "-100", "100.5"
        // "-100"을 -100으로 형 변환
        System.out.println("Integer.parseInt(\"-100\") = " + Integer.parseInt("-100"));
        int num2 = Integer.parseInt("-100");
        System.out.println("num2 + 100 = " + (num2 + 100));
        // "100.5"를 100.5로 형 변환
        System.out.println("Double.parseDouble(\"100.5\") = " + Double.parseDouble("100.5"));
        double num3 = Double.parseDouble("100.5");
        System.out.println("num3 + 100 = " + (num3 + 100));
        // 2. "백", "hundred"
        // "백"을 int로 형 변환
        // System.out.println("Integer.parseInt(\"백\") = " + Integer.parseInt("백"));
        // NumberFormatException : "백"은 우리가 변환할 수 있는 형태의 숫자가 아니야
        // "hundred"를 int로 형 변환
//        System.out.println("Integer.parseInt(\"hundred\") = " + Integer.parseInt("hundred"));
        // NumberFormatException

        // int to String
        int num4 = 200;
        System.out.println("num4 = " + num4);
        System.out.println("num4.toString() = " + new Integer(num4).toString());

        // 2. 강제 변환 방식 (괄호에 강제로 타입 넣어서 변환)
        // str을 강제로 int로 변환
        String str2 = "200";
//        System.out.println("(int) str2 = " + (int) str2);
        // int를 강제로 double로 변환
        int num5 = 300;
        System.out.println("(double) num5 = " + (double) num5); // 소수점이 있는 형태
        double num6 = 200.5;
        System.out.println("(int) num6 = " + (int) num6); // 소수점이 삭제된 형태
    }
}
