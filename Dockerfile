# 베이스 이미지를 선택합니다.
FROM tomcat:8.5-jdk11-openjdk-slim

# 작업 디렉토리를 설정합니다.
WORKDIR /usr/local/tomcat

# 기본 ROOT 폴더를 삭제합니다.
RUN rm -rf webapps/ROOT

# tomcat 사용자 및 그룹을 생성합니다.
RUN groupadd -r tomcat && useradd -r -g tomcat tomcat

# 새로운 폴더를 생성합니다.
RUN mkdir -p /usr/local/tomcat/conf/Catalina/localhost
RUN mkdir -p /usr/local/tomcat/webapps/ROOT

# 권한을 설정합니다.
RUN chown -R tomcat:tomcat /usr/local/tomcat

# WAR 파일을 Docker 이미지에 복사합니다.
COPY target/*.war webapps/ROOT.war

# WAR 파일의 소유자와 권한을 변경합니다.
RUN chown tomcat:tomcat webapps/ROOT.war && chmod 644 webapps/ROOT.war

# 포트를 노출시킵니다.
EXPOSE 8080

# 컨테이너가 시작될 때 실행할 명령어를 설정합니다.
CMD ["catalina.sh", "run"]
