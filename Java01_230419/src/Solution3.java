import java.text.MessageFormat;
import java.util.Arrays;

public class Solution3 {
    public static void main(String[] args) {
        // String : 0개 이상의 문자를 연결해서 표현한 것
        // 원시 자료형 타입 - 객체(참조) 자료형 타입
        // -> 기본적으로 깔려 있고, 별도의 기능이 구현 X
        // 객체(참조) 자료형 타입 : 대문자로 시작 + 여러가지 추가 기능(메소드)
        // str(...), '', "". -> 파이썬
        System.out.println("Hello World"); // "Hello World" -> 큰 따옴표로 묶어서 생성
//        System.out.println('H'); // 'H' -> 엄밀히 말하면 문자열이 아님...
        // 자바에서 문자열을 나타내는 자료형은 String ""
        String str = "Hello World";
        System.out.println(str);
        String str2 = "12345";
        System.out.println(str2);
        // 클래스를 통한 객체의 생성
        String str3 = new String("Hello World"); // new 키워드 -> 특정한 클래스를 바탕으로 객체를 생성해주는 키워드
        // 키워드 -> 특정한 언어에서 특정한 기능을 위해서 미리 빼놓은 단어들
        System.out.println(str3);

        // 객체 자료형 -> 어떤 특징을 가지는가? -> 이를 통해 만들어지는 애들은 '객체' 취급.
        // 인스턴스. -> 속성이라는 '변수', 메소드라는 '함수'
        // 자바에는 '함수'가 없음.

        // **equals
        String str4 = "Hello World"; // 리터럴 <- 메모리 낭비를 막기 위해서 비슷한 건 그냥 캐시 메모리 사용
        // 같은 주소값 -> 참조하는 메모리 상의 위치가 같음
        String str5 = new String("Hello World"); // 생성자 (__init__)
        String str6 = new String("Hello World"); // 생성자 (__init__)
        // new -> 생성자로 만들면 기존에 만들었던 것을 재활용 X -> 만들 때마다 새로운 주소값 (메모리)
        // 파이썬과는 달리, 자바에서는 클래스 생성자를 통해 만들어진 객체들은 비교 시 주소값을 비교.
        System.out.println("str4 == str5");
        System.out.println(str4);
        System.out.println(str5);
        System.out.println(str4 == str5); // false
        System.out.println(str5 == str6); // false
        System.out.println(str4.equals(str5)); // true
        // A(String), B(String) A.equals(B)
        // -> A == B (A와 B의 주소값이 아니라, 안에 담긴 String 문자열 리터럴이 일치하는지 비교하는 메소드)

        // indexOf : 문자열에서 특정 문자열이 시작되는 위치
        String str7 = "Hello World";
        System.out.println("str7.indexOf(\"l\")"); // sout
        System.out.println(str7.indexOf("l")); // 2
        // 최초로 발견되는 인덱스를 알려주는 메소드
        System.out.println("str7.indexOf(\"World\")"); // sout
        System.out.println(str7.indexOf("World")); // 6
        // 없을 때
        System.out.println("str7.indexOf(\"Bye\")"); //
        System.out.println(str7.indexOf("Bye")); // -1

        // contains : 문자열이 특정 문자열에 포함이 되어 있는지
        // A.contains(B) : A라는 문자열에 B가 포함 되어 있는가?
        System.out.println("str7.contains(\"Hello\")");
        System.out.println(str7.contains("Hello"));
        System.out.println("str7.contains(\"Bye\")");
        System.out.println(str7.contains("Bye"));

//        System.out.println(str7[0]);
        // charAt : char -> character
        System.out.println("str7.charAt(0)");
        System.out.println(str7.charAt(0)); // H
        System.out.println(str7.length());
//        System.out.println(str7.charAt(11));
        // String index out of range: 11
        // 자바에서도 가능한 범위를 넘어서 인덱스를 호출하면 오류가 납니다.
//        System.out.println(str7.charAt(-1));
        // String index out of range: -1
        System.out.println(str7.charAt(str7.length()-1));

        // replaceAll : 문자열 중에서 특정 문자열을 검색하여 대체
        String str8 = "Hello World";
        System.out.println(str8.replaceAll("l", "L")); // HEllo World
        // 정규표현식도
        System.out.println(str8.replace("l", "L")); // HEllo World
        // 단어만

        // substring (sub-string)
        String str9 = "Hello Java!";
        System.out.println(str9.substring(6)); // Java!
        System.out.println(str9.substring(2, 6));

        // 대문자 소문자
        String str10 = "Hello Java!";
        System.out.println("str10");
        System.out.println(str10);
        System.out.println("str10.toUpperCase()");
        System.out.println(str10.toUpperCase());
        System.out.println("str10.toLowerCase()");
        System.out.println(str10.toLowerCase());

        // 쪼개기. 스플릿 (Split)
        String split = "a:b:c:d";
        String[] result = split.split(":");
        System.out.println(result); // <- 주소값과 타입
        System.out.println(Arrays.toString(result)); // [a,b,c,d]

        // 문자열 포매팅 (String Formatting)
        System.out.println(String.format("나는 오늘 %d원 짜리 밥을 먹었다", 6300));
        System.out.println(String.format("나는 오늘 %s에서 밥을 먹었다", "구내식당"));
        int money = 4500;
        System.out.println(String.format("나는 오늘 %d원 짜리 밥을 먹었다", money));
        // MessageFormat.format("my name is {0}", name);
        String name = "Jung";
        System.out.println(MessageFormat.format("my name is {0}", name));
        // 값이 2개 이상일 때
        double height = 175.5;
        String name2 = "Jung";
        System.out.println(String.format("내 이름은 %s이고, 내 키는 %f이다.", name2, height));
        System.out.println(String.format("내 이름은 %s이고, 내 키는 %.4f이다.", name2, height));
        System.out.println(MessageFormat.format("my name is {0}, height is {1}", name2, height));
    }
}