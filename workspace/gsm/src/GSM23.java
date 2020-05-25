import gsm.poly.*;
public class GSM23 {

	public static void main(String[] args) {
		Object[] obj = new Object[2];
		obj[0] = new a();
		obj[1] = new b();
		display(obj);

	}

	private static void display(Object[] obj) {
		for(int i=0;i<2;i++) {
		if(obj[i] instanceof a) {
			((a) obj[i]).ptr();
		}else {
			((b) obj[i]).ptr();
		}
	}
  }

}
