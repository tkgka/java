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
		
		//id�� oracle�� ȸ���� pwd�� oraxe, AGE�� 30���� ����
		
		menberVO vo = new menberVO(id, pwd, age);
		MemberDAO dao = new MemberDAO();
		
		int cnt = dao.memUpdate(vo);
		if(cnt>0) {
			System.out.println("����");
		}else {
			System.out.println("����");
		}
		

	}

}