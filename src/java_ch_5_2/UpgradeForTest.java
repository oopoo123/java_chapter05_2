package java_ch_5_2;

public class UpgradeForTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {1, 2, 3, 4};
//		int[] arr2
		
		int sum = 0;
		
		for(int i = 0; i < arr1.length; i++) {
			sum = sum + arr1[i];
		}
		
		boolean[] arrBool = {false, true, true};
		boolean[] arrBool2 = new boolean[3];
		
		//파이썬 문법:for i in arr1:
		
		for (int value : arr1) { // 향상된 for문
			sum = sum + value;
		}
	}

}
