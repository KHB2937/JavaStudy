package datatype;

import java.text.MessageFormat;
import java.util.Arrays;

public class Solution1 {
    public static void main(String[] args) {
        // String
        String name = "John"; // "" (큰따옴표 사용해서 만들기)
        String name2 = new String("John"); // new 키워드를 통해서 생성자로 만들기
        System.out.println("name = " + name);
        System.out.println("name2 = " + name2);
        System.out.println("name == name2 = " + (name == name2));
        // 왜 일치하지 않나요? -> 기본적으로 String 타입의 비교는 '주소값'이 일치하는지 보기 때문.
        String name3 = "John";
        System.out.println("name == name3 = " + (name == name3)); // "John" <- 즐겨찾기
        // new라는 생성자로 만들면 무조건 다른 주소를 가지는 객체

        // eqauls
        System.out.println("name.equals(name2) = " + name.equals(name2));
        // contains
        System.out.println("name.contains(\"J\") = " + name.contains("J"));
        // split
        String[] names = name.split("");
        System.out.println("Arrays.toString(names) = " + Arrays.toString(names));

        // String Formatting
        String str = String.format("name = %s", name);
        System.out.println("str = " + str);
        // MessageFormat
        String str2 = MessageFormat.format("name = {0}", name);
        System.out.println("str2 = " + str2);
    }
}
