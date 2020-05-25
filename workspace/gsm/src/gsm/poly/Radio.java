package gsm.poly;

public class Radio implements Remote{

	@Override
	public void VolUp() {
		
		System.out.println("라디오 소리up");
		
	}

	@Override
	public void VolDown() {
 
		System.out.println("라디오 소리up");
		
	}

	@Override
	public void Internet() {
		
		System.out.println("인터넷 사용 불가");
		
	}

}
