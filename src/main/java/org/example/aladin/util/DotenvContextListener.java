package org.example.aladin.util;

import io.github.cdimascio.dotenv.Dotenv;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.nio.file.Paths;

@WebListener
public class DotenvContextListener implements ServletContextListener {
    private static final String DOTENV_FILENAME = ".env";

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        // dotenv 객체 생성 및 .env 파일 로드
        try {
            Dotenv dotenv = Dotenv.load();

            System.out.println(dotenv.get("DB_URL"));
            System.out.println(dotenv.get("DB_USER"));
            System.out.println(dotenv.get("DB_PASSWORD"));

            // 환경변수 설정
            System.setProperty("DB_URL", dotenv.get("DB_URL"));
            System.setProperty("DB_USER", dotenv.get("DB_USER"));
            System.setProperty("DB_PASSWORD", dotenv.get("DB_PASSWORD"));
        } catch (Exception e) {
            System.out.println("** DotEnv를 감지할 수 없음");
            e.printStackTrace();
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        // do nothing
    }

}