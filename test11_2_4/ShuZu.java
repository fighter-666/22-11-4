package test11_2_4;

public class ShuZu {
	public static void main(String[] args) {
		int[] arr = {9,8,7,6,5};
		printArray(arr);
	}
	
	public static void printArray(int[] arr) {
		for(int i = 0;i<arr.length;i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println("\n");
	}
	
}
