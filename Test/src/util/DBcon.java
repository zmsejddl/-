package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBcon {
	Connection conn;
	Statement stmt;
	PreparedStatement pstmt;
	ResultSet rs;

	/*
	 * DB connection
	 */
	public DBcon() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mariadb://localhost:3307/baseball", "root", "1234");
			if (conn != null) {
				System.out.println("DB 접속 성공");
			}

		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로드 실패");
		} catch (SQLException e) {
			System.out.println("DB 접속 실패");
			e.printStackTrace();
		}
	}

	public String[][] findAll() {
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from rank order by time");

			String[][] resultArr = new String[10][3]; // 최대 10줄

			for (int i = 0; i < 10 && rs.next(); i++) {
				System.out.println(rs.getString("name") + " " + rs.getInt("time"));

				resultArr[i][0] = (i + 1) + "위"; // 순위
				resultArr[i][1] = (rs.getString("name")); // 이름
				resultArr[i][2] = Integer.toString(rs.getInt("time")); // 걸린 시간
			}
			return resultArr;

		} catch (SQLException e) {
			System.out.println("select 쿼리 실패");
			e.printStackTrace();
			return null;
		}
	}

	public void save(String name, int time) {
		try {
			String sql = "insert into rank values(?, ?)";
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, name);
			pstmt.setInt(2, time);

			int insertCount = pstmt.executeUpdate();
			System.out.println(insertCount + "행 삽입 성공");
		} catch (SQLException e) {
			System.out.println("insert 쿼리 실패");
			e.printStackTrace();
		}
	}

	/*
	 * DB Connection, statement, resultset close
	 */
	public void close() {
		try {
			stmt.close();
			rs.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
