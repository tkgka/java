import gsm.util.IntArr;
import gsm.util.MyUtil;

public class GSM11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[5];
		
		IntArr arr1 = new IntArr();
		IntArr arr2 = new IntArr(20);
		
		//�迭�� �����͸� �����ϴ� ����
		arr1.Add(10);
		arr1.Add(20);
		arr1.Add(30);
		int v = arr[2];
		
		int data = arr1.get(2);
		System.out.println(data);
		
		
		System.out.println(arr1.size());
		
		
		for (int i=0;i<arr1.size();i++) {
			System.out.println(arr1.get(i));
		}
	}

}
