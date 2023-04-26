import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyDB {
    public static void main(String[] args) {
        // DB -> DB는 주소를 가지고 있음
//        String url = "jdbc:mysql://localhost:3306/mydb?serverTimezone=UTC&useSSL=false";
//        String user = "XXXX";
//        String password = "XXXX";
        String url = "jdbc:mysql://aws.connect.psdb.cloud/my_db?sslMode=VERIFY_IDENTITY";
        String user = "fm1j8p0xdtz8he6gbkts";
        String password = "pscale_pw_1USLy3bZXSWW8EDjQfoahGHJFQC507v76hhrzdNacJX";
        try {
            // JDBC 드라이버를 로딩
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, password);
            // 연결 성공 메시지
            System.out.println("데이터베이스 연결 성공");
        } catch (ClassNotFoundException e) {
            // 드라이버 연결에 실패
//            throw new RuntimeException(e);
            e.printStackTrace(); // 에러가 난 내용에 대해서 표시
        } catch (SQLException e) {
            // 데이터베이스 연결 실패 시 나오는 에러
            e.printStackTrace(); // 에러가 난 내용에 대해서 표시
        }
    }
}
