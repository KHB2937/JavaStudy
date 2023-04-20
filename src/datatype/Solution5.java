package datatype;

import java.util.ArrayList;

public class Solution5 {
    public static void main(String[] args) {
        // 프로그래밍 언어
        // 리스트/배열
        ArrayList<String> langList = new ArrayList<String>();
        // python, java, c, c++ 추가
        langList.add("python");
        langList.add("java");
        langList.add("c");
        langList.add("c++");
        langList.add("c+++"); // 임의의 데이터를 추가
        System.out.println("langList = " + langList);
        // 가짓수가 이미 정해져있는 묶음 데이터에 대해서 어떻게 처리?

        // enum
        ArrayList<Language> langList2 = new ArrayList<Language>();
        langList2.add(Language.JAVA);
        langList2.add(Language.PYTHON);
        langList2.add(Language.C);
        langList2.add(Language.CPP);
//        langList2.add(Language.CPPP); <- 개발자가 이미 만들어놓지 않은 추가적인 옵션을 만들 수 X
        System.out.println("langList2 = " + langList2);
    }
}

enum Language { // 데이터 묶음이자 타입
    JAVA, PYTHON, C, CPP // 그 타입 안에 속하는 것들
} // 내가 설정한 고유의 묶음들.
// 1. enum + 이름 (클래스 이름 짓듯이)
// 2. 중괄호 묶어서 그 속에 그 enum의 옵션으로 들어갈 내용들 변수명처럼 입력
// 2.1. 다 대문자로 입력해버림.