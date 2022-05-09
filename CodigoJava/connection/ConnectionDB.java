package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionDB {

	private static String driver = "com.mysql.cj.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost:3306/aulas?useTimezone=true&serverTimezone=UTC";
	private static String user = "root";
	private static String password = "Rafinhahm1";

	public static Connection getConnection() {
		try {
			Class.forName(driver);
			return DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException | SQLException e) {
			throw new RuntimeException("Erro na conecção: ", e);
		}
	}

	public void testeConexao() {
		try {
			Connection con = getConnection();
			System.out.println(con);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void closeConnection(Connection con, PreparedStatement stmt) {

		try {
			if (con != null) {
				con.close();
			}
		} catch (SQLException e) {			
			e.printStackTrace();
		}
	}
	
	public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs) {
		
		closeConnection(con, stmt);
		
		try {
			if(rs!= null) {
				rs.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
