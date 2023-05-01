package io.playdata.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // 이 클래스가 스프링에서 컨트롤러 역할을 수행하는 클래스임을 나타내는 애노테이션입니다.

public class HelloWorldController {

    @GetMapping("/") // HTTP GET 요청이 / 경로로 들어오면 실행되는 메서드를 정의한 것입니다.
    public String hello(Model model) { // Model 객체를 인자로 받아서 뷰에 데이터를 전달할 수 있습니다.
        model.addAttribute("name", "World"); // "name"이라는 이름으로 "World"라는 값을 Model 객체에 추가합니다.
        return "hello"; // "hello"라는 뷰 이름을 반환합니다. 이는 스프링에서 뷰 리졸버가 "hello"라는 이름의 뷰를 찾아 클라이언트에게 전달합니다.
    }
}
