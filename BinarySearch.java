import java.util.*;

// Applicable only in sorted array

public class BinarySearch {
	
	public static int binarySearchRecursive(int[] arr, int x, int left, int right) {
		if(left > right)
			return -1;
		
		// Integer OVerflow int mid = (left+right)/2;
		int mid = left + ((right - left) / 2);
		int midValue = arr[mid];
		if(midValue == x) {
			return mid;
		} else if(x < midValue){
			return binarySearchRecursive(arr, x, left, mid-1);
		} else  {
			return binarySearchRecursive(arr, x, mid+1, right);
		}
	}

	public static int binarySearchIterative(int[] arr, int x) {
		
		int left = 0;
		int right = arr.length - 1;

		while(left <= right) {
			int mid = left + ((right - left) / 2);
			int midValue = arr[mid];
			if(midValue == x) {
				return mid;
			} else if(x < midValue){
				right = mid - 1;
			} else  {
				left = mid + 1;
			}
		}
		
		return -1;
	}


	public static void print(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		System.out.println("Binary Search");
		int[] arr = new int[]{5, 4, 1, 2, 3};
		int i = binarySearchRecursive(arr, 3, 0, arr.length);
		System.out.println(i);

		int j = binarySearchIterative(arr, 3);
		System.out.println(j);

		//print(arr);
	}

}
