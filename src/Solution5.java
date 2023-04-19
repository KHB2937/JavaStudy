import java.util.ArrayList; // python에서도 import를 쓰긴 했는데...
import java.util.Arrays;
import java.util.Comparator;
// from ...(경로) import (...)

public class Solution5 {
    public static void main(String[] args) {
        // List
        // ArrayList
        // 길이가 고정적이다 -> Array
        // ArrayList : 길이가 가변적. + 인덱스를 바탕으로 요소를 조회. + 공통된 타입 + 유사한 메소드 (Array...)
        ArrayList menu = new ArrayList(); // new 생성자 -> ArrayList라는 타입을 지니는 -> 객체. 인스턴스.
        menu.add("pizza"); // add <- (python) append. (js) push.
        menu.add("burger");
        menu.add("hotdog"); // add -> 맨끝에 추가. menu.add(menu.size(), "hotdog");
        System.out.println("menu = " + menu);
        menu.add(0, "coke"); // 인덱스를 통한 중간 끼워넣기가 가능
        System.out.println("menu = " + menu);
        menu.add(1);
        System.out.println("menu = " + menu);

        ArrayList<String> menu2 = new ArrayList(); // <> 안에다가 제한시킬 타입
        menu2.add("pizza");
        // menu2.add(1234); // java: incompatible types: int cannot be converted to java.lang.String
        System.out.println("menu2 = " + menu2);

        ArrayList<Integer> menu3 = new ArrayList(); // Integer = int
        menu3.add(1);
//        menu3.add("burger"); // java: incompatible types: java.lang.String cannot be converted to int
        System.out.println("menu3 = " + menu3);

        System.out.println(menu.get(1)); // menu arraylist의 1번째 요소를 가져온다
        menu.set(1, "salad"); // menu arraylist의 1 에 salad 를 대입
        System.out.println("menu = " + menu);
        // get : 가져옴, set : 설정함(집어넣음, 바꿈)
        // POJO : Plain Old Java Object
        // Lombok

//        System.out.println(menu.length());
        // size : arrayList의 크기
        System.out.println("menu.size() = " + menu.size());
        
        // contains
        System.out.println("menu.contains(\"pizza\") = " + menu.contains("pizza"));
        System.out.println("menu.contains(\"burger\") = " + menu.contains("burger"));

        // remove
        menu.remove(0); // remove(index)
        System.out.println("menu = " + menu);
        // 메소드 오버로딩(over-loading), 메소드 오버라이딩(over-riding)
        // 오버로딩은 이름은 같은데 패러미터 구조가 다르면 다른 기능을 할 수 있게
        // 오버라이딩은 이름이 같고 패러미터 구조도 같은 상황에서, 상속 받은 상위 클래스의 메소드를 재정의
        menu.remove("salad");
        System.out.println("menu = " + menu);

        // (1) add 를 통해서 만드는 방법 <- 위 참조
        // (2) Array를 ArrayList로 변환
        String[] foods = {"pizza", "burger", "hotdog"};
        ArrayList<String> foods2 = new ArrayList<>(Arrays.asList(foods)); // 이미 있는 변수(배열) -> 변환
        System.out.println("foods2 = " + foods2);
        foods2.add("beer");
        System.out.println("foods2 = " + foods2);
        
        ArrayList<String> foods3 = new ArrayList<>(
                Arrays.asList("pizza", "burger", "hotdog") // 가변 인자로 여러 개의 String
        );
        System.out.println("foods3 = " + foods3);

        // join
        String join = String.join(", ", foods);
        // String.join -> delimiter (구분자), 배열 혹은 나열된 데이터
        System.out.println("Arrays.toString(foods) = " + Arrays.toString(foods));
        System.out.println("join = " + join);
        join = String.join("; ", foods);
        System.out.println("join = " + join); // ",".join(???)
        join = String.join("; ", foods2);
        System.out.println("join = " + join);
        
        // sort
        ArrayList<Integer> nums = new ArrayList<>(
                Arrays.asList(31, 12, 17)
        );
        System.out.println("nums = " + nums);
        nums.sort(null); // **오름차순(ascending) <-> 내림차순(descending)
        System.out.println("null / nums = " + nums);
        // null = none = void
        nums.sort(Comparator.naturalOrder()); // 작은 것부터 커지는게 자연적.
        System.out.println("naturalOrder / nums = " + nums);
        nums.sort(Comparator.reverseOrder()); // sort -> 1.8
        System.out.println("reverseOrder / nums = " + nums);
    }
}
