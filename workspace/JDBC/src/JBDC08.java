import java.util.*;
import java.sql.*;
public class JBDC08 {
		 public static void main(String[] args) {

		        String id = "java";
		        String pwd = "java3204";
		        int age = 20;

		        try {
		            Class.forName("oracle.jdbc.driver.OracleDriver");
		            String URL="jdbc:oracle:thin:@127.0.0.1:1521:XE";
		            String user="hr";
		            String password="hr";
		            Connection conn= DriverManager.getConnection(URL, user, password);
		            Statement st=conn.createStatement();

		            String SQL = "update mygsm set pwd=?, age=? where id=?";

		            PreparedStatement ps = conn.prepareStatement(SQL);
		            ps.setString(3, id);
		            ps.setString(1, pwd);
		            ps.setInt(2, age);
		            int cnt = ps.executeUpdate();

		            if (cnt > 0) {
		                System.out.println("성공");
		            } else {
		                System.out.println("실패");
		            }


		        } catch (Exception e) {
		            e.printStackTrace();
		        }
		    }
}
