import java.util.List;
import java.util.Scanner;

import kr.gsm.MemberDAO;
import kr.gsm.menberVO;

public class JDBC12 {

	public static void main(String[] args) {
		
		MemberDAO dao = new MemberDAO();
		List<menberVO>list = dao.getAllList();
		System.out.println("-------------------------------------");
		if(list.size() > 0) {
			for (int i = 0; i < list.size(); i++) {
				menberVO vo = list.get(i);
				
				System.out.println(vo);
				
			}
			System.out.println("-------------------------------------");
			for(menberVO vo :list) {
				System.out.println(vo);
			}

		}else {
			System.out.println("데이터 없음");
		}
		
		
		

	}

}
