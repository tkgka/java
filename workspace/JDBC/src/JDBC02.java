import java.sql.*;

public class JDBC02 {

	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String URL = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
			String user = "hr";
			String password = "hr";
			Connection conn = DriverManager.getConnection(URL, user, password);
			if(conn != null) {
			System.out.println("立加己傍");	
			}else {
				System.out.println("立加角菩");
			}
			
		}catch (Exception e){
			e.printStackTrace();
		}
	

	}

}
