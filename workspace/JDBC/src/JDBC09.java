import java.util.Scanner;
import kr.gsm.MemberDAO;
import kr.gsm.menberVO;
public class JDBC09 {
	public static void main(String[] args) {
		
		//keyboard�� ���� id,pwd,age�� �Է¹޾Ƽ�  tblmem table�� ����

		Scanner scan = new Scanner(System.in);
		System.out.print("id:");
		String id = scan.next();
		System.out.println("pwd:");
		String pwd = scan.next();
		System.out.println("age:");
		int age = Integer.parseInt(scan.next());
		
		menberVO vo = new menberVO(id, pwd, age);
		MemberDAO dao = new MemberDAO();
		
		int cnt = dao.memInsert(vo);
		if(cnt>0) {
			System.out.println("Insert����");
		}else {
			System.out.println("����");
		}
		
		
		
		
	}

}
