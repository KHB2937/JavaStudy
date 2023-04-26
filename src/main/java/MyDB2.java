import java.sql.*;

public class MyDB2 {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://aws.connect.psdb.cloud/my_db?sslMode=VERIFY_IDENTITY";
        String user = "fm1j8p0xdtz8he6gbkts";
        String password = "pscale_pw_1USLy3bZXSWW8EDjQfoahGHJFQC507v76hhrzdNacJX";

        Connection conn = null; // DB와의 연결
        Statement stmt = null; // SQL 입력
        ResultSet rs = null; // SQL 출력

        try {
            // JDBC 드라이버를 로딩
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);
            // 연결 성공 메시지
            System.out.println("데이터베이스 연결 성공");
            // DB를 통해서 입력해줄 수 있는 입력 창구
            stmt = conn.createStatement();
            // 원하는 SQL 문장을 넣어서 실행
            String sql = "SELECT * FROM students;";
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                // 결과가 한 줄씩
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                System.out.println(id + " " + name + " " + age);
            }

        } catch (ClassNotFoundException e) {
            // 드라이버 연결에 실패
//            throw new RuntimeException(e);
            e.printStackTrace(); // 에러가 난 내용에 대해서 표시
        } catch (SQLException e) {
            // 데이터베이스 연결 실패 시 나오는 에러
            e.printStackTrace(); // 에러가 난 내용에 대해서 표시
        } finally {
            try {
                // 자원 반환 -> 그냥 두면 DB랑 연결된 상태에서 자리를 낭비
                // 종료하기 전에 의도적으로 삭제.
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
