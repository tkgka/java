import gsm.util.FloatArray;
import gsm.util.IntArr;

public class GSM13 {

	public static void main(String[] args) {
		
		
		FloatArray arr = new FloatArray();
		
		arr.Add(3204.0f);
		arr.Add(1.0f);
		arr.Add(2.0f);
		arr.Add(3.0f);
		arr.Add(4.0f);
		arr.Add(5.0f);
		arr.Add(6.0f);
		
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i));
		}

	}

}
