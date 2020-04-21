
public class GSM01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= 10;
		int b = 20;
		int c = 30;
		
		int[] arr = new int [3];
		arr[0] = a;
		arr[1] = b;
		arr[2] = c;
		 
		hap(arr);			
	}
	public static void hap(int[] arr) {
		int sum = 0;
		for(int i : arr) {
			sum += i;
		}
		System.out.println(sum);
		
	}
}
