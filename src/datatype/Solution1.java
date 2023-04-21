package datatype;

import java.util.HashMap;
import java.util.Map;

public class Solution1 {
    public static void main(String[] args) {
        // HashMap -> Python Dictionary -> Key, Value -> key를 통해서 해당 관련된 value
        // 자료구조 또는 프로그래밍 구조 또는 프레임워크
        // HashMap의 생성과 속성
        // Map이 본체고, Hash는 구현하는 방식. ArrayList. List가 본체고, Array 구현 방식
//        Map map = new HashMap();
        // 꺾쇠 -> <Key의 타입, Value의 타입>
        Map<String, String> map = new HashMap();
        // Map이 있는데, Key가 String, Value도 String
        // 속성 -> 속성? : 특정한 클래스를 통해서 생성된 인스턴스(객체) -> 이 객체 안에 변수로써 들어가 있는 값들.
        System.out.println("map = " + map);
        System.out.println("map.size() = " + map.size());
        // map 안의 들어간 원소들의 크기.

        // HashMap의 CRUD 메소드.
        // CREATE - 추가.
        // READ - 읽기.
        // UPDATE - 수정.
        // DELETE - 삭제.
        // 기능명세서 (그대로 씀), DB 조작 (DDL, DML), WEB-HTTP
        // * SQL 언어에서의 CRUD
        // DDL - Data Definition Language (데이터 정의어)
        // DML - Data Manipulation Language (데이터 조작어)
        // DDL -> Table (표 자체, 엑셀 파일 정도의 단위)
        // DML -> Row (한 줄의 데이터.)
        // 테이블을 위한 CRUD와 데이터를 위한 CRUD.
        // 테이블을 위한 CRUD : CREATE, SELECT/DESC, ALTER, DROP
        // 데이터를 위한 CRUD : INSERT, SELECT, UPDATE, DELETE
        // JPA - Java Persistence API (Persistence -> C/U -> Save)
        // * WEB, HTTP, RESTful API에서의 CRUD
        // CREATE -> POST (발송)
        // READ -> GET (접속)
        // UPDATE -> PUT (덮어씌우기), PATCH (수정)
        // PUT - 아예 그 데이터 묶음 자체를 대체해버림 (1번 자리 -> 변영인-> 변영일)
        // PATCH - 데이터의 특정 속성만 수정 (1번 자리 -> 변영인 -> 변영일 (개명신청))
        // DELETE -> DELETE (삭제)

        // HashMap main CRUD methods
        // CREATE <- SAVE
        map.put("name", "Kim");
        map.put("age", "20");
        map.put("gender", "male");
        map.put("address", "Seoul");
        System.out.println("map = " + map);
        // READ
        System.out.println("map.get(\"name\") = " + map.get("name"));
        // UPDATE
        map.put("name", "Lee"); // == CREATE
        System.out.println("map = " + map);
        // DELETE
        map.remove("age");
        System.out.println("map = " + map);
    }
}
