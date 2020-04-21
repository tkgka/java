package gsm.util;

public class GSM10 {

	public static void main(String[] args) {
		int v = MyUtil.hap(10, 20);
		float vv= MyUtil.hap(10.5f, 25.6f);
		System.out.println(v);
		System.out.println(vv);
		

		int a = 90;
		int b = 30;
		int ex = Math.max(a, b);
		
		System.out.println(ex);
	}

}
