import java.util.*;
import java.sql.*;
public class JDBC06 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("ID: ");
		String id = scan.next();
		System.out.println("pwd: ");
		String pwd = scan.next();
		
		System.out.println("age: ");
		int age = Integer.parseInt(scan.next());
//		System.out.println(id+"\t"+pwd+"\t"+age);
		
		try {
			 Class.forName("oracle.jdbc.driver.OracleDriver");
	            String URL = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
	            
	            String user = "hr";
	            String password = "hr";
	            
	            Connection conn = DriverManager.getConnection(URL, user, password);
	            Statement st = conn.createStatement();
	            String SQL = "insert into mygsm values('"+id+"','"+pwd+"','"+age+"')";
	            int cnt = st.executeUpdate(SQL);
	            if(cnt >0) {
	            	System.out.println("�Է¼���");
	            }else {
	            	System.out.println("�Է½���");
	            }
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

	}

}
