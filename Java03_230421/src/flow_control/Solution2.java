package flow_control;
// 같은 패키지 경로 안에 있으면 한 파일에 있는 듯이 해당 enum, class 등을 사용 가능.

public class Solution2 {
    public static void main(String[] args) {
        // Switch-case
        // switch -> 특정 값인지 여부를 검사할 변수명을 넣음 (switch(...))
        // -> 특정한 값을 만족시키는지를 case 값: ...
        // example code please
//        int a = 10;
        // int a가 0부터 30 사이의 값을 랜덤으로 할당받음
        int a = (int) (Math.random() * 31);
        System.out.println("a = " + a);
        switch (a) {
            case 10:
                System.out.println("10");
                break;
            case 20:
                System.out.println("20");
                break;
            case 30:
                System.out.println("30");
                break;
            default:
                System.out.println("default");
        }

        // Chicken enum을 사용하여, 전체 속성 중에 하나를 랜덤으로 뽑아 변수로 대입하고,
        // 그 변수에 따라서 switch case 문으로 각기 다른 메시지 출력
        Chicken chicken = Chicken.values()[(int) (Math.random() * Chicken.values().length)];
        System.out.println("chicken = " + chicken);
        switch (chicken) {
            case Fried:
                System.out.println("Fried");
                break;
            case GreenOnion:
                System.out.println("GreenOnion");
                break;
            case HoneyCombo:
                System.out.println("HoneyCombo");
                break;
            default:
                System.out.println("default");
        } // java: reached end of file while parsing
    }
}
