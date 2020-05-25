import gsm.util.IntArr;
import gsm.util.MyUtil;

public class GSM12 {
	public static void main(String[] args) {
		
		IntArr arr = new IntArr(7);
		
		arr.Add(3204);
		arr.Add(1);
		arr.Add(2);
		arr.Add(3);
		arr.Add(4);
		arr.Add(5);
		arr.Add(6);
		
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i));
		}
		
		
	}
}
