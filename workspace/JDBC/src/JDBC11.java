import java.util.Scanner;

import kr.gsm.MemberDAO;

public class JDBC11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("id:");
		String id = scan.next();
		MemberDAO dao = new MemberDAO();
		
		int cnt = dao.memDelete(id);
		if(cnt>0) {
			System.out.println("Delete����");
		}else {
			System.out.println("����");
		}
		
	}

}