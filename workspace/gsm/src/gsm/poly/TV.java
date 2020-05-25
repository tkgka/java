package gsm.poly;

public class TV implements Remote{

	@Override
	public void VolUp() {
		
		System.out.println("TV 소리up");
		
	}

	@Override
	public void VolDown() {
		System.out.println("TV 소리down");
	}

	@Override
	public void Internet() {
		System.out.println("인터넷 사용 가능");
	}
	

}
