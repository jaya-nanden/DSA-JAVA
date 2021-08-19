import java.util.*;



public class BubbleSort  {
	
	public static void bubblesort(int[] arr) {
		boolean isSorted = false;
		int lastUnsorted = arr.length - 1;
		System.out.println(lastUnsorted);
		while(!isSorted) {
			isSorted = true;
			for(int i = 0; i < lastUnsorted; i++) {
				if(arr[i] > arr[i+1]) {
					swap(arr, i, i+1);
					isSorted = false;
				}	
			}
			// Optimization
			lastUnsorted--;
		}
	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void print(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String args[]) {
	
		System.out.println("Bubble Sort");
		int[] arr = new int[]{5, 4, 1, 2, 3};
		bubblesort(arr);
		print(arr);
		
	}



}