import java.sql.*;
import java.util.Scanner;

public class DBConnectExample {
	public static void main(String[] args) {

		String dbDriver = "org.mariadb.jdbc.Driver";
		String dbUrl = "jdbc:mariadb://localhost:3307/jdbc";
		String id = "root";
		String passwd = "1234";
		Connection conn = null;
		PreparedStatement pstmt = null;

		Scanner scan = new Scanner(System.in);
		try {
			Class.forName(dbDriver);
			conn = DriverManager.getConnection(dbUrl, id, passwd);

			if (conn != null) {
				System.out.println("DB 연결 완료:");
				String query = "Select * from student_info";
				Statement st = conn.createStatement();
				ResultSet res = st.executeQuery(query);
				while (res.next()) {
					System.out.println("학생 번호: " + res.getString("std_id"));
					System.out.println("학생 이름: " + res.getString("std_name"));
					System.out.println("학생 나이: " + res.getString("std_age"));
					System.out.println("학생 학년: " + res.getString("std_grade"));
					System.out.println("학생 성별: " + res.getString("std_gender"));
					System.out.println("학생 연락처: " + res.getString("std_phone"));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (scan != null) {
					scan.close();
				}

				if (pstmt != null) {
					pstmt.close();
				}

				if (conn != null) {
					conn.close();
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
