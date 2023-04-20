package datatype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Solution2 {
    public static void main(String[] args) {
        // Make an int Array
        int[] intArray = new int[5];
        // 내가 넣으려고 하는 자료형 [], 변수명 = new (자료형)[길이];
        // 예약! 자리 수 없이 예약 X (배열, Java Array)
        intArray[0] = 10;
        intArray[1] = 20;
        intArray[2] = 30;
        intArray[3] = 40;
        intArray[4] = 50;
        // 5개! 0~4 index. 5 넣으면? -1 넣으면?

        // 요소를 통해서 정수(int) 배열을 만들기
        int[] intArray2 = {10, 20, 30, 40, 50}; // 얘는 length를 속성으로?
        // 해당 배열 한번에 전체 프린트하기
        System.out.println(Arrays.toString(intArray2));

        // 배열의 길이 (intArray2)
        System.out.println(intArray2.length);
        // 배열 -> length 속성. String -> length(). 메소드.
        String str = "Hello";
        System.out.println(str.length());
        String[] strArr = {"Hello", "World"};
        System.out.println(strArr.length);

        // ArrayList 만들기
        ArrayList<Integer> list = new ArrayList<>(); // 의존성 바로 불러오기 : Alt + Enter
        // Integer라는 타입의 속성들을 넣을 빈 ArrayList()
        // -> 길이가 가변적

        // 길이를 지정해서 ArrayList 만들기
        ArrayList<Integer> list2 = new ArrayList<>(10);

        // Wrapper class like Integer
        // int -> 기본 자료형 -> 클래스가 아니라서 메소드나 다른 기능 X
        // 자바에서의 클래스처럼 -> int가 아니라 int와 유사한 새로운 클래스 (Wrapping)
        // Wrapper Class. -> int -> Integer, double -> Double...

        // ArrayList에 원소 CRUD 해보기
        // Create (생성, 추가)
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        // Read (불러오기, 확인하기)
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));
        // Update (수정하기) -> 찾는 방법. 1) 인덱싱. 키. 2) 검색.
        list.set(0, 100);
        System.out.println(list.get(0));
        // Delete
        list.remove(0);
        System.out.println(list.get(0));

        // Create an ArrayList by inserting elements directly
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        System.out.println("list3 = " + list3);

        // String.join
        String str2 = String.join(" ", "Hello", "World"); // 가변인수로 받음 ...
        // delimiter : 구분자, separator
        System.out.println("str2 = " + str2);
        // String.join By String[]
        String[] strArr2 = {"Hello", "World"};
        String str3 = String.join(" ", strArr2);
        System.out.println("str3 = " + str3);
        // String.join By ArrayList
        ArrayList<String> list4 = new ArrayList<>(Arrays.asList("Hello", "World"));
        String str4 = String.join(" ", list4);
        System.out.println("str4 = " + str4);

        // ArrayList 정렬
        ArrayList<Integer> list5 = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        list5.sort(null); // NaturalOrder -> 오름차순
        System.out.println("list5 : null = " + list5);
        // By Comparator.NaturalOrder
        list5.sort(Comparator.naturalOrder()); // 오름차순
        System.out.println("list5 : naturalOrder = " + list5);
        // 내림차순
        list5.sort(Comparator.reverseOrder());
        System.out.println("list5 : reverseOrder = " + list5);
        // sort 1.8.
        // 랜덤 하게 순서 섞기
        list5.sort((o1, o2) -> (int) (Math.random() * 3) - 1);
        System.out.println("list5 : random = " + list5);
        // 람다식 쓰지 않고 랜덤 하게 순서 섞기
        list5.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return (int) (Math.random() * 3) - 1;
            }
        });
        System.out.println("list5 : random = " + list5);
    }
}
