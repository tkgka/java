import gsm.poly.*;
public class GSM22 {

	public static void main(String[] args) {
		// a a= new a();
		//a.ptr();
		Object obj= new a();
		((a)obj).ptr();
		
		a a = new a();
		display(a);
		b b = new b();
		display(b);

	}

	private static void display(Object obj) {
		if(obj instanceof a) {
			((a) obj).ptr();
		}else {
			((b) obj).ptr();
		}
		
	}

}
