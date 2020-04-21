
public class GSM07 {

	public static void main(String[] args) {
		//책 3권 메모리 저장 후 출력은 for문으로

		
	BookDTC[] b = new BookDTC[3];
	
	 b[0] = new BookDTC("자바","김수환",32000,500);
	 b[1] = new BookDTC("js","김수환",33000,600);
	 b[2] = new BookDTC("노드","김수환",34000,700);
	 System.out.println("제목     이름     가격     페이지     ");
	 System.out.println("-------------------------");
	 for(int i=0;i<3;i++) {
		 System.out.println(b[i].getTitle()+" "+b[i].getName()+"   "+b[i].getPrice()+"   "+b[i].getPage());
	 }
	}

}
