package io.playdata.webapp;
import org.springframework.stereotype.Controller; // 스프링에서 컨트롤러임을 나타내는 어노테이션을 import
import org.springframework.web.bind.annotation.RequestMapping; // 요청 매핑 어노테이션을 import
import org.springframework.web.servlet.ModelAndView; // 모델 데이터와 뷰 이름을 담는 객체를 import

@Controller // 컨트롤러 역할을 하는 클래스에 사용하는 어노테이션
public class HelloWorldController {

    @RequestMapping("/") // URL 경로를 매핑하는 어노테이션, 현재는 "/" 경로에 대한 요청을 처리
    public ModelAndView hello() { // 요청에 대한 응답을 처리하는 메소드
        System.out.println("hello");
        ModelAndView mv = new ModelAndView(); // ModelAndView 객체 생성
        mv.setViewName("index"); // 뷰 이름 설정, 여기서는 index.jsp 파일과 연결
        mv.addObject("message", "Hello World!"); // 모델 데이터 설정, key-value 형태로 전달
        return mv; // ModelAndView 객체 반환
    }
}
