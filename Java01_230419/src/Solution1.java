public class Solution1 {
    public static void main(String[] args) {
        // hello world
        System.out.println("Hello World!");

        // 파이썬과 달리 (#) 자바에서의 주석은 //
        // 들여쓰기가 중요하지 않음. 대신에 코드가 끝나면 세미콜론(;)이 필요
        // 파이썬에서는 들여쓰기로 구현했던 조건문이나 반복문, 함수 등은 {}(brace)을 통해서 표현

        // Number in Java
        // 정수형 숫자 (소수점이 없음)
        int a = 10; // int : integer, '정수' : 소수점이 없는 숫자 표현
        // 일정 이상의 긴 길이의 정수 숫자는 뭐로 표현? long
        long b = 100_000_000_000_000_000L; // long이 끝이 아님... 더 큰 것도 (BigDecimal...?)
        System.out.println(a);
        System.out.println(b);
        // 실수형 숫자 (소수점이 있음)
        float c = 3.14111111f; // float : floating point
        double d = 3.14111111; // double : double precision floating point
        // 뒤에 타입을 나타내는 대소문자가 붙으면, 걔네들은 숫자처리의 default가 아님
        System.out.println(c);
        System.out.println(d);
        // 사칙연산. 대입연산자. 증감연산자 (++, --) -> 위치에 따른 실행 순서 차이
        // phind -> 자바에서 숫자 자료형을 통해 연산을 하는 대표적인 케이스 20개. (한글로 설명해줘)
        // chatgpt -> 응용 (빈칸 채우기, 오류 코드 수정 등...)
    }
}
