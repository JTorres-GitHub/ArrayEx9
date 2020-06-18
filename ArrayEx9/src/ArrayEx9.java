import java.util.Arrays;

public class ArrayEx9 {
	public static int[] firstLastEle(int[] arr){
		int new0 = arr[0];
		int new1 = arr[arr.length -1];
		int[] newArr = new int[]{new0, new1};
		
		return newArr;
	}
	
	public static void main(String[] arg){
		int[] array1 = new int[]{1, 2, 3};
		int[] array2 = new int[]{1, 2, 3, 4};
		int[] array3 = new int[]{7, 4, 6, 2};
		int[] array4 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		System.out.println(Arrays.toString(firstLastEle(array1)));
		System.out.println(Arrays.toString(firstLastEle(array2)));
		System.out.println(Arrays.toString(firstLastEle(array3)));
		System.out.println(Arrays.toString(firstLastEle(array4)));
	}
}
