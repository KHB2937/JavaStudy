package advanced;

// 패키지는 폴더 -> 현재 자바 파일이 속해져있는 경로
// 파이썬과의 차이점?

import oop.part1.Cartoon; // import 불러오는 것.
import oop.part2.*; // * -> 특정 경로 아래 있는 모든 클래스를 불러오기

import java.util.ArrayList; // 자바 내장 클래스.
// 얘네들도 from 쓸 수 있나? X.
// 얘네들도 as 쓸 수 있나? X.
// import문에 대해서는 파이썬과 한 번 비교하는 질문.


public class Solution1 {
    public static void main(String[] args) {
        Cartoon c = new Cartoon();
        Animal a = new Animal();
        ArrayList arrayList = new ArrayList();
    }
}
