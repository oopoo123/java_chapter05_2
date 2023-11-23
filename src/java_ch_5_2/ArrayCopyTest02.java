package java_ch_5_2;

public class ArrayCopyTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {1, 2, 3};
		int[] arr2 = new int[5];
		
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
//System.arraycopy(원본배열이름, 원본의 복사가 시작될 인덱스, 복사본배열이름, 복사본배열의 붙여넣기가 될 시작 인덱스, arr1.length);
		
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}

	}

}
