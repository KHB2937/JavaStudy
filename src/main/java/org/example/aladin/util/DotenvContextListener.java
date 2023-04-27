package org.example.aladin.util;

import io.github.cdimascio.dotenv.Dotenv;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class DotenvContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        // dotenv 객체 생성 및 .env 파일 로드
        String dbUrl = System.getenv("DB_URL");
        String dbUser = System.getenv("DB_USER");
        String dbPassword = System.getenv("DB_PASSWORD");

        if (dbUrl != null && dbUser != null && dbPassword != null) {
            // 환경 변수를 사용하여 작업을 수행합니다.
            System.out.println("* 환경 변수를 사용하여 작업을 수행합니다.");
        } else {
            // 환경 변수가 설정되어 있지 않으면, .env 파일에서 값을 가져옵니다.
            System.out.println("* 환경 변수가 설정되어 있지 않아서, .env 파일에서 값을 가져옵니다.");
            try {
                Dotenv dotenv = Dotenv.load();
                dbUrl = dotenv.get("DB_URL");
                dbUser = dotenv.get("DB_USER");
                dbPassword = dotenv.get("DB_PASSWORD");

                // 가져온 값을 시스템 프로퍼티에 설정합니다.
                System.setProperty("DB_URL", dbUrl);
                System.setProperty("DB_USER", dbUser);
                System.setProperty("DB_PASSWORD", dbPassword);
            } catch (Exception e) {
                System.out.println("** DotEnv를 감지할 수 없음");
                e.printStackTrace();
            }

            if (dbUrl == null || dbUser == null || dbPassword == null) {
                System.out.println("* 환경 변수와 .env 파일에서 DB 연결 정보를 가져올 수 없습니다.");
            }

            System.out.println("DB_URL: " + dbUrl);
            System.out.println("DB_USER: " + dbUser);
            System.out.println("DB_PASSWORD: " + dbPassword);
        }

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        // do nothing
    }

}