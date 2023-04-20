package flow_control;

public class Solution2 {
    public static void main(String[] args) {
        // https://fastapi.tiangolo.com/ko/ <- fastapi
        // switch, case. -> case에 맞춰서 결과값이 switcing 되는 것.

//        int a = 1;
        // 1부터 5 사이의 값이 임의로 주어지는 a 값을 초기화
        int a = (int) (Math.random() * 5) + 1;
        System.out.println("a = " + a);
        switch (a) { // if (조건) {실행문}
            // 변수 => case "값" == 연속적으로 체크.
            case 1:
                System.out.println("a is 1");
                break; // case를 만족시켰다면 더 이상 뒤의 case를 검토하지 마세요.
            case 2:
                System.out.println("a is 2");
                break;
            case 3:
                System.out.println("a is 3");
                break;
//            default: // 아무 case도 거치지 못하고 (break 되지 않고) 끝까지 왔을 때 처리해주는 거
//                System.out.println("a is not 1, 2, or 3");
//                // default는 꼭 있을 필요가 X
        }

        // switch 문 작성
        // python, java, c, cpp 의 case가 있고,
        // 이 4개의 값 중에 랜덤으로 1를 뽑아 lang이라는 변수에 넣고
        // lang 변수를 switch 문으로 통해서 검사
        // default로 '해당 없음'이라는 메시지를 출력
        String[] langs = {"python", "java", "c", "cpp", "javascript"};
        String lang = langs[(int) (Math.random() * langs.length)];
        System.out.println("lang = " + lang);
        switch (lang) {
            case "python":
                System.out.println("lang is python");
                break;
            case "java":
                System.out.println("lang is java");
                break;
            case "c":
                System.out.println("lang is c");
                break;
            case "cpp":
                System.out.println("lang is cpp");
                break;
            default:
                System.out.println("lang is not python, java, c, cpp");
                break;
        }

        // LunchMenu를 바탕으로 Random하게 1개의 값을 뽑고,
        // 해당 변수를 switch case로 검사.
        // enum.values() -> enum이 가진 속성들의 배열. (타입 -> enum 클래스인)
        LunchMenu menu = LunchMenu.values()[(int) (Math.random() * LunchMenu.values().length)];
        System.out.println("menu = " + menu);
        switch (menu) { // Enum -> menu 변수가 LunchMenu
            case KIMCHI: // 타입이 없어도 Enum 중에 하나라고 감지.
                System.out.println("menu is kimchi");
                System.out.println("kimchi 1+1");
                break;
            case BULGOGI:
                System.out.println("menu is bulgogi");
                break;
            case BANANA:
                System.out.println("menu is banana");
                break;
            case SOUP:
                System.out.println("menu is soup");
                break;
            case PASTA:
                System.out.println("menu is pasta");
                break;
            default:
//                System.out.println("menu is not kimchi, bulgogi, banana, soup, pasta");
                // menu를 lower로 변경
                System.out.println(String.format("menu is %s", menu.toString().toLowerCase()));
        }
    }
}

enum LunchMenu { // enum(enumeration), 상수집합
    KIMCHI, BULGOGI, BANANA, SOUP, PASTA, RAMEN, SUSHI, MARATHANG, SALAD, GREEN_TEA, BLACK_TEA, COFFEE, JUICE
}