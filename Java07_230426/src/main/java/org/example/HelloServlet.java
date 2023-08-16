package org.example;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req,
                      HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html"); // 응답이 HTML 파일 형태
        PrintWriter out = resp.getWriter(); // 응답에 적을 내용을 담을 PrintWriter 객체를 불러오기
        out.println("<html><body>");
        out.println("<h2>Hello, world!</h2>");
        out.println("</body></html>");
    }
}