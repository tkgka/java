package kr.gsm;
import java.sql.*;
import java.util.*;
public class MemberDAO {
	
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	

	public Connection getDBconnect() {
		String URL="jdbc:oracle:thin:@127.0.0.1:1521:XE";
        String user="hr";
        String password="hr";
        
        try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(URL, user, password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return conn;
        
        
	}
	// memInsert()
	
	public int memInsert(menberVO vo) {
		conn = getDBconnect();
		String SQL = "insert into tblmem values(?,?,?)";
		int cnt=0;
		
		try {
			ps = conn.prepareStatement(SQL);
			ps.setString(1, vo.getId());
			ps.setString(2, vo.getPwd());
			ps.setInt(3, vo.getAge());
			cnt = ps.executeUpdate();
		}catch(Exception E) {
			E.printStackTrace();
		} finally {
			dbClose();
		}
		return cnt;
	}
	
	
	public int memUpdate(menberVO vo) {
		conn = getDBconnect();
		String SQL = "update tblmem set pwd=?, age=? where id=?";
		int cnt=0;
		
		try {
			ps = conn.prepareStatement(SQL);
			ps.setString(3, vo.getId());
			ps.setString(1, vo.getPwd());
			ps.setInt(2, vo.getAge());
			cnt = ps.executeUpdate();
		}catch(Exception E) {
			E.printStackTrace();
		} finally {
			dbClose();
		}
		return cnt;
	}
	
	
	
	
	public void dbClose() {
		
			try {
				if(rs!=null)rs.close();
				if(ps!=null)ps.close();
				if(conn!=null)conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
			
	}
	

}
