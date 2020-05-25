package gsm.util;

public class MovieArray {
	 private MovieVO[] arr;
	   private int cnt;
	   public MovieArray() {
	      this(10);
	   }
	   public MovieArray(int initial) {
	      arr = new MovieVO[initial];
	   }
	   
	   public int size() {
	      return cnt;
	   }
	   
	   public void add(MovieVO data) {
	      arr[cnt++] = data;
	   }
	   
	   public MovieVO get(int idx) {
	      return arr[idx];
	   }
	
	
}
