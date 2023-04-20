package datatype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution4 {
    public static void main(String[] args) {
        // Set - 집합 -> 중복되지 않고 + 순서없는 값들 간의 묶음
        // HashSet 생성
        HashSet<String> set = new HashSet<>(); // 길이를 안 정해도 됨 -> List
        // Set <...> set = new HashSet<>(길이);
        // -> 상속. 인터페이스, 다형성...
        System.out.println("set = " + set);

        // 5개 길이의 HashSet 생성
        HashSet<String> set2 = new HashSet<>(5); // Capacity : 용량
        System.out.println("set2 = " + set2);

        // 원소들을 넣어서 HashSet 생성
        HashSet<String> set3 = new HashSet<>(
                Set.of("Java", "Python", "C++", "JavaScript", "C#"));
        System.out.println("set3 = " + set3);

        // HashSet CRUD 메소드 or 자주 쓰이는 메소드
        // add()
        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("JavaScript");
        set.add("C#");
        System.out.println("set = " + set);

        // remove()
        set.remove("C#");
        System.out.println("set = " + set);

        // clear()
        set.clear();
        System.out.println("set = " + set);

        // isEmpty()
        System.out.println("set.isEmpty() = " + set.isEmpty());

        // size()
        System.out.println("set.size() = " + set.size());

        // contains()
        System.out.println("set.contains(\"Java\") = " + set.contains("Java"));

        // https://sharegpt.com/c/xoPm2PE
        // https://sharegpt.com/c/DLLeNAM

        // 중복값이 많이 있는 리스트를 Set를 통해서 고유값(unique)만 남기기
        // Leaving only unique values through Set a list with many duplicate values
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(3);
        System.out.println("list = " + list);
        Set<Integer> set4 = new HashSet<>(list);
        System.out.println("set4 = " + set4);
        /*
        헤이즐아메리카노(iced)
        (아이스)마카다미아라떼
        (아이스)헤이즐아메리카노
        (아이스)헤이즐라떼
        카페모카(아이스 ㅎ)
        (아이스)바닐라라떼
        (아이스)헤이즐아메리카노
        (아이스)헤이즐아메리카노
        체리콕에이드(감사합니다!)
        체리콕에이드(감사합니다!)
        (아이스)아메리카노
        아이스티
        (아이스)초코라떼
        (아이스)헤이즐아메리카노
        아이스 카페라떼
        (아이스)아메리카노
        (아이스) 유자민트레몬티
        (아이스)바닐라라떼
        (아이스)아메리카노
        복숭아아이스티
        (아이스)카페라떼
        아이스티
         */
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList(
                "헤이즐아메리카노(iced)", "(아이스)마카다미아라떼",
                "(아이스)헤이즐아메리카노", "(아이스)헤이즐라떼", "카페모카(아이스 ㅎ)",
                "(아이스)바닐라라떼", "(아이스)헤이즐아메리카노", "(아이스)헤이즐아메리카노",
                "체리콕에이드(감사합니다!)", "체리콕에이드(감사합니다!)", "(아이스)아메리카노",
                "아이스티", "(아이스)초코라떼", "(아이스)헤이즐아메리카노", "아이스 카페라떼",
                "(아이스)아메리카노", "(아이스) 유자민트레몬티", "(아이스)바닐라라떼",
                "(아이스)아메리카노", "복숭아아이스티", "(아이스)카페라떼", "아이스티"
        ));

        System.out.println("list2 = " + list2);

        Set<String> set5 = new HashSet<>(list2);
        System.out.println("set5 = " + set5);
    }
}
