import java.util.Scanner;
import kr.gsm.MemberDAO;
import kr.gsm.menberVO;
public class JDBC09 {
	public static void main(String[] args) {
		
		//keyboard로 부터 id,pwd,age를 입력받아서  tblmem table에 저장

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
			System.out.println("Insert성공");
		}else {
			System.out.println("실패");
		}
		
		
		
		
	}

}
