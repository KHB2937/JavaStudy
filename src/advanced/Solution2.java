package advanced;
// 내부에서 직접 만든 클래스는 모두 src 기준의 패키지 경로

import access.MyPrivate;
import access.MyPublic;
public class Solution2 { // public? : 가장 오픈되어 있다.
    public static void main(String[] args) {
        // Public -> Protected -> Default -> Private
        MyPublic mp = new MyPublic("나는 공개된 사람");
        mp.print();
        // java: MyProtected(java.lang.String) has protected access in access.MyProtected
//        MyProtected mpr = new MyProtected("나는 보호받는 사람");
        MyProtected2 mpr = new MyProtected2("나는 보호받는 사람");
        mpr.print();
//        MyDefault md = new MyDefault("이 이 이");
        // public이 아니라서 못 씀
        MyDefault2 md = new MyDefault2("나는 Default");
        md.print();
//        MyPrivate mp3 = new MyPrivate(); // private 접근자인 생성자라서 -> 불러올 수가 X
    }
}
