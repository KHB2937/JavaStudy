package flow_control;

public class Solution3 {
    public static void main(String[] args) {
        // 반복문 - while문.
        int i = 0;
        while (i < 10) { // while(조건) {실행문} -> 조건이 True 될때까지 실행
            System.out.println(i);
            i++; // 증가연산자. i = i + 1
        }

//        int i2 = 0;
//        while (i2 < 10) { // while(조건) {실행문} -> 조건이 True 될때까지 실행
//            System.out.println(i2); // 중단 조건이 없기 때문에 계속 공급
//        }

        // python while 반복문
        // break & continue
//        int i10 = 0;
//        while (i10 < 10) { // while(조건) {실행문} -> 조건이 True 될때까지 실행
//            System.out.println(i10);
//        }

        int i3 = 1;
        while (i3 < 10) { // while(조건) {실행문} -> 조건이 True 될때까지 실행
            System.out.println("Hello i3 = " + i3);
            // 3의 배수 발견시 while 강제 종료
            if (i3 % 3 == 0) {
                System.out.println("Bye i3 = " + i3);
                break;
            }
            i3++;
        }

        // continue
        int i4 = 0;
        while (i4 < 10) { // while(i4 < 10) {
            i4++;
            if (i4 % 2 == 0) { // i4가 2의 배수라면, 반복을 스킵하고 다음으로 넘어감
                continue; // 더이상 뒤를 실행하지 않고, 다음 반복으로.
            }
            System.out.println("i4 = " + i4);
        }

        // 항상 참인 while (무한 루프)
        int i5 = 1;
        while (true) { // while(true) {실행문} -> 중간에 break가 나올 때까지 반복 실행
            // 횟수나 조건이 가변적일 수 있는 상황에서, while 내부 코드로 break를 통해 반복 제어
            System.out.println("Hello i5 = " + i5);
            // 3의 배수 발견시 while 강제 종료
            if (i5 % 3 == 0) {
                System.out.println("Bye i5 = " + i5);
                break;
            }
            i5++;
        }

        // do while
        int i6 = 10;
        do { // 한 번은 함
            System.out.println("Hello i6 = " + i6);
            i6++;
        } while (i6 < 10);
        // while (실행이 안되요)
        int i7 = 10;
        while (i7 < 10) { // if 조건문 내장
            System.out.println("Hello i7 = " + i7);
            i7++;
        }
    }
}
