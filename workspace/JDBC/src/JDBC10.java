import java.util.Scanner;

import kr.gsm.MemberDAO;
import kr.gsm.menberVO;

public class JDBC10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("id:");
		String id = scan.next();
		System.out.println("pwd:");
		String pwd = scan.next();
		System.out.println("age:");
		int age = Integer.parseInt(scan.next());
		
		//id가 oracle인 회원의 pwd를 oraxe, AGE를 30으로 수정
		
		menberVO vo = new menberVO(id, pwd, age);
		MemberDAO dao = new MemberDAO();
		
		int cnt = dao.memUpdate(vo);
		if(cnt>0) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
		

	}

}
