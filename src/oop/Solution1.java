package oop;

public class Solution1 {
    public static void main(String[] args) {
        // Cartoon 객체 생성
        Cartoon cartoon = new Cartoon(); // ?????? 어디갔어? 돌려줘요 내 생성자 ㅠㅠ
        // 메소드 오버로딩으로 기본 생성자도 추가
        System.out.println("cartoon.author = " + cartoon.author);
        System.out.println("cartoon.name = " + cartoon.name);

        // 직접 대입 연산자로 할당
        cartoon.author = "오다 에이치로";
        cartoon.name = "원피스";
        cartoon.name = "";
        System.out.println("cartoon.author = " + cartoon.author);
        System.out.println("cartoon.name = " + cartoon.name);

        // 메소드를 사용해서 할당
        cartoon.setName("유유백서");
        System.out.println("cartoon.name = " + cartoon.name);
        cartoon.setName("");
        System.out.println("cartoon.name = " + cartoon.name);

        // 생성자 (Constructor)
        Cartoon cartoon2 = new Cartoon("스파이더맨", "스탠 리");
        System.out.println("cartoon2.author = " + cartoon2.author);
        System.out.println("cartoon2.name = " + cartoon2.name);
    }
}
