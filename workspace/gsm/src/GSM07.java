
public class GSM07 {

	public static void main(String[] args) {
		//å 3�� �޸� ���� �� ����� for������

		
	BookDTC[] b = new BookDTC[3];
	
	 b[0] = new BookDTC("�ڹ�","���ȯ",32000,500);
	 b[1] = new BookDTC("js","���ȯ",33000,600);
	 b[2] = new BookDTC("���","���ȯ",34000,700);
	 System.out.println("����     �̸�     ����     ������     ");
	 System.out.println("-------------------------");
	 for(int i=0;i<3;i++) {
		 System.out.println(b[i].getTitle()+" "+b[i].getName()+"   "+b[i].getPrice()+"   "+b[i].getPage());
	 }
	}

}
