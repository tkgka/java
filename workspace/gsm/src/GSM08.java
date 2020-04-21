public class GSM08 {
	public static void main(String[] args) {
		System.out.println(total(1,1));
		GSM08 g = new GSM08();
		int vv = g.twoHap(10, 20);
		System.out.println(vv);
	}
	
	public static int total(int a ,int b){
		return a+b;
	}
	
	public static int twoHap(int a, int b) {
		int sum=0;
		if(a>b) {
			for(int i=b;i<=a;i++) {
				sum+= i;
			}
		}else {
			for(int i=a;i<=b;i++) {
				sum+=i;
			}
		}
		return sum;
	}

}
