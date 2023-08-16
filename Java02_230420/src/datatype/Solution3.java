package datatype;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Solution3 {
    public static void main(String[] args) {
        // Map <- Dictionary
        // Hash -> #
        // https://www.phind.com/search?cache=1198e107-80ec-4c98-a093-1bc839c57c7b

        // Java Map
        // HashMap
        HashMap<String, String> map = new HashMap<>();
        // HashMap : 타입 이름. 클래스 이름.
        // <Key, Value>
        // new -> 생성.

        // map CRUD 메소드

        // put(key, value) - CREATE - 생성, 추가
        map.put("name", "이경영");
        map.put("age", "20");
        map.put("address", "seoul");
        map.put("phone", "010-1234-5678");

        System.out.println("map = " + map);

        // get(key) - READ - 읽기
        String name = map.get("name");
        System.out.println("name = " + name);

        String age = map.get("age");
        System.out.println("age = " + age);

        // remove(key) - DELETE - 삭제
        map.remove("age");
        System.out.println("map = " + map);

        // make map copy
        // HashMap<String, String> map2 = map; // shallow copy (얕은 복사)
        HashMap<String, String> map2 = new HashMap<>(map); // deep copy (깊은 복사)
        System.out.println("map2 = " + map2);
        map2.clear(); // 아예 지워버림
        System.out.println("map2 = " + map2);

        // map의 크기 확인
        System.out.println("map.size() = " + map.size());
        
        // dictionary : key, value -> key list, value list, k-v list
        // key list // set -> 중복을 허용하지 않음 + 키이자 값임.
        System.out.println("map.keySet() = " + map.keySet());
        // value list
        System.out.println("map.values() = " + map.values());
        // k-v list -> entry (python - dict.items()
        System.out.println("map.entrySet() = " + map.entrySet());

        // 키가 포함되어있는지, 값이 포함되어 있는지
        // python -> in? 키 혹은, 리스트라면 값.
        // contain key
        System.out.println("map.containsKey(\"name\") = " + map.containsKey("name"));
        // contain key error case
        System.out.println("map.containsKey(\"name1\") = " + map.containsKey("name1"));

        // contain value
        System.out.println("map.containsValue(\"이경영\") = " + map.containsValue("이경영"));
        // contain value false case
        System.out.println("map.containsValue(\"황제성\") = " + map.containsValue("황제성"));

        // LinkedHashMap
        // LinkedHashMap 만드는 코드
        // import java.util.LinkedHashMap;
//        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();

        // often use hashmap methods
        // put(key, value) - CREATE -
        // get(key) - READ -
        // remove(key) - DELETE -
        // clear() -
        // size() -
        // containsKey() -
    }
}
