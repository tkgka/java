package gsm.util;

public class IntArr {

	private int[] arr;
	private int cnt; //0
	
	public int size() {
		return cnt;
	}
	
		public IntArr() {	
			//arr = new int[10];
			this(10);
		}
	
		public IntArr(int size) {	
			arr = new int[size];
			
		}
		public void Add(int value) {
			
			arr[cnt++] = value;
			
			
		}
		public int get (int idx) {
			return arr[idx];
		}
}
