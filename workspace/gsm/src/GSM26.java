import gsm.poly.Radio;
import gsm.poly.Remote;
import gsm.poly.TV;

public class GSM26 {

	public static void main(String[] args) {
	
		Remote[] re = new Remote[2];
		
		re[0] = new TV();
		re[1] = new Radio();
		
		start(re);
		

	}

	private static void start(Remote[] re) {
		for(int i=0;i<2;i++) {
			if(re[i] instanceof TV) {
				((TV) re[i]).VolUp();
				((TV) re[i]).VolDown();
				((TV) re[i]).Internet();
			}else if(re[i] instanceof Radio) {
				((Radio) re[i]).VolUp();
				((Radio) re[i]).VolDown();
				((Radio) re[i]).Internet();
			}
		}
		
	}

}
