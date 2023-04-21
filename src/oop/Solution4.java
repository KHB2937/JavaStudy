package oop;

public class Solution4 {
    public static void main(String[] args) {
        Movie johnWick = new Movie();
        johnWick.name = "John Wick";
        johnWick.hour = 2;
        johnWick.actor = "Keanu Reeves";
        johnWick.intro();

        ActionMovie johnWick2 = new ActionMovie();
        johnWick2.name = "John Wick 2";
        johnWick2.hour = 3;
        johnWick2.actor = "Keanu Reeves";
        johnWick2.intro();
        johnWick2.bang();
//        johnWick.bang(); // 에러? -> 상속을 해준 Movie는 상속을 받은 ActionMovie에 영향 X

        // Action Movie는 Movie의 일종?
        // Movie는 Action Movie?
        // IS-A
        Movie johnWick3 = new ActionMovie(); // Action Movie가 가진 추가기능 사용 X
//        ActionMovie actionMovie = new Movie();
        // java: incompatible types: oop.Movie cannot be converted to oop.ActionMovie
        // IS-A => 변환이 가능한지 (큰 범위에서 작은 범위로 변환 가능, 작은 범위에서 큰 범위로는 변환 불가능)
        // ㄱ IS-A ㄴ. ㄱ은 ㄴ의 일종이다. 고로 ㄱ은 ㄴ으로 변환 가능하다.
        // -> 상속. -> 이미 구현된 클래스를 전달 받아서
        //             내가 필요한 만큼 변경시키거나 추가시킴
//        johnWick3.bang();

        // Programmer: canSpring, canPytorch. <- 상속을 받아서 변경을 했더라도, 이 메소드들은 가지고 있다고 보장.
        // SuperProgrammer : canReact.
        // HyperProgrammer : canFlutter.
        // https://sharegpt.com/c/utxrMzi
        System.out.println("--4--");
        GunActionMovie johnWick4 = new GunActionMovie();
        johnWick4.name = "John Wick 4";
        johnWick4.hour = 5;
        johnWick4.actor = "Keanu Reeves";
        johnWick4.gunName = "K2";
        johnWick4.bang();
    }
}
