
public class GSM02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = new int[3];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		
		int[] b = {4,3,1,2,5};
		
		for(int i : b) {
			if(i%2 == 0) 
				System.out.println(i);
			
		}	
			
		int even = 0;
		int odd = 0;
		
			for(int v : b) {
				if(v%2 ==0) {
					even += v;
				}else {
					odd += v;
				}
			}
		
		System.out.println(even-odd);
	}

}
