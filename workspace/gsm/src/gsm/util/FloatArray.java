package gsm.util;

public class FloatArray {
private float[] arr;
private int cnt;


public int size() {
	return cnt;
}

	public FloatArray(){	
		//arr = new int[10];
		this(10);
	}

	public FloatArray(int size) {	
		arr = new float[size];
		
	}
	public void Add(float value) {
		
		arr[cnt++] = value;
		
		
	}
	public float get (int idx) {
		return arr[idx];
	}

}
