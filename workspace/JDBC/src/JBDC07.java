import java.util.*;
import java.sql.*;
public class JBDC07 {

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
	            //String SQL = "insert into mygsm values('"+id+"','"+pwd+"','"+age+"')";
	            String SQL = "insert into mygsm values(?,?,?)";
	            PreparedStatement ps = conn.prepareStatement(SQL);
	            ps.setString(1, id);
	            ps.setString(2, pwd);
	            ps.setInt(3, age);
	            int cnt = ps.executeUpdate();
	            //int cnt = st.executeUpdate(SQL);
	            if(cnt >0) {
	            	System.out.println("입력성공");
	            }else {
	            	System.out.println("입력실패");
	            }
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
