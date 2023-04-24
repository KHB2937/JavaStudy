package oop.part1;

//public class Cartoon extends Object {
public class Cartoon {
    String name;
    String author;
    // 멤버변수들을 가장 위에 두고... 그 다음에 생성자를 둠.

    // 생성자 -> new 키워드와 클래스 자체 이름이 만났을 때 호출되는 메소드
    /*
    * Cartoon() {}
    * */
    // 생성자가 하나도 없으면, 그냥 얘가 있다고 취급.
    Cartoon() {}
    // 생성자도 메소드의 일종이기 때문에,
    // 같은 이름이지만 다른 패러미터를 가진 메소드를 의미하는
    // '메소드 오버로딩' Method overloading

    // 생성자를 manual, 수동, 직접. 지정
    Cartoon(String name, String author) {
        this.name = name;
        this.author = author;
    }

    // 1. 생성자는 클래스명과 메서드명이 동일함. (생성자만이 유일한 객체 생성방법 X)
    // - GoF의 생성 패턴, POJO(Plain Old Java Object)
    // 2. 리턴 타입 (void? X) -> 클래스를 통해서 만들어진 객체 자체가 생성자니까.
    // 3. 아무것도 지정 안하면 default 생성자 (클래스이름())가 1개 자동생성.
    // - 새롭게 생성자를 만들었따면, default 생성자는 굳이 만들어주지 않는 이상 (오버로딩)
    // - default 생성자는 삭제 되기에, 만약에 이미 썼다면 default도 재정의해줘야함.

    // setName
    void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("Name is empty");
            return; // stop the function
        }
        this.name = name; // self. (python)
    }
}
