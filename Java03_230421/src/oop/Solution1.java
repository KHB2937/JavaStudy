package oop;

// 객체지향형 이란 무엇인가?
public class Solution1 {
    public static void main(String[] args) {
        // ** 절차 지향형 프로그래밍 : 변수와 실행문 중심 (함수)의 프로그래밍.
        // -> 재사용성과 유지보수가 어렵다 (매머드 커피 프로그램) -> (커피 사피엔스 프로그램)
        // https://sharegpt.com/c/fLAaFzq
        // make_a_coffee() # 무엇을 수정해야할지에 대한 시각화나 구조화가 힘듦
        // ** 객체 지향형 프로그래밍
        // -> 재사용성과 유지보수? 거대한 개발을?
        // 객체/클래스 -> (매머드 커피) => 커피 => 커피 전문점을 운영 => 커피, 직원, ... => 프로그래밍.
        // Coffee, CoffeeMachine, Employee... => 메소드 # 주체, 대상, 중심들을 위주로...
        // 구형 커피머신 -> 신형 커피머신 => 전체를 다시 코딩할 필요 X
        // cf. 함수 지향형 프로그래밍? (...)

        // 모든 프로그래밍 구현된 것들은 '클래스'의 형태를 띄어야함.
        // 함수들은 클래스에 소속된 메소드여야만 함.
        // 클래스 : 인스턴스 객체의 설계도. -> 객체에 들어갈 변수(속성), 함수(메소드)들이 이미 정의된 형태.

        // 객체 지향형 코딩
        Student kim = new Student();
        // 입실하기
        kim.enter();
        // 잠자기
        kim.sleep();
        // 공부
        kim.study();

        Student lee = new Student();
        lee.enter();
        lee.sleep();
        lee.study();

        Student park = new Student();
        park.enter();
        park.sleep();
        park.study();

        Student hong = new Student();
        hong.enter();
        hong.sleep();
        hong.study();
    }
}
