import java.sql.*;
import kr.gsm.*;
import java.util.*;

public class JDBC05 {

    public static void main(String[] args) {
        ArrayList<menberVO> list = new ArrayList<menberVO>();
        
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String URL = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
            
            String user = "hr";
            String password = "hr";
            
            Connection conn = DriverManager.getConnection(URL, user, password);
            Statement st = conn.createStatement();
            
            String SQL = "select * from mygsm";
            ResultSet rs = st.executeQuery(SQL);
            
            while(rs.next()) {
                String id = rs.getString("id");
                String pwd = rs.getString("pwd");
                int age = rs.getInt("age");
                
                //System.out.println(id +"\t" + pwd + "\t" + age);
                menberVO vo  = new menberVO(id, pwd, age);
                list.add(vo);
            }
            
            listprint(list);
            } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void listprint(ArrayList<menberVO> list) {
    	System.out.println("3204");
        for (menberVO memberVO : list) {
            System.out.println(memberVO);
        }
    }
}