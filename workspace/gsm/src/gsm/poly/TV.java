package gsm.poly;

public class TV implements Remote{

	@Override
	public void VolUp() {
		
		System.out.println("TV �Ҹ�up");
		
	}

	@Override
	public void VolDown() {
		System.out.println("TV �Ҹ�down");
	}

	@Override
	public void Internet() {
		System.out.println("���ͳ� ��� ����");
	}
	

}
