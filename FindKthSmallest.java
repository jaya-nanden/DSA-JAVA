class QuickSort {

	public static void swap(int[] arr, int i, int j)
	{
	    int temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
	}

	public static int partition(int[] arr, int low, int high) {

		int pivot = arr[high];
		int i = (low - 1);

		for(int j = low; j <= high; j++) {
			if(arr[j] < pivot) {
				i++;
				swap(arr, i, j);
			}
		}

		swap(arr, i+1, high);
		return (i+1);
	}



	public static void quicksort(int[] arr, int low, int high) {

		if(low < high) {
			int pivot = partition(arr, low, high);

			quicksort(arr, low, pivot-1);
			quicksort(arr, pivot+1, high);
		}
	}
	
	public static void main(String[] args) {

		System.out.println("Quick Sort:");

		int[] arr = {10, 80, 30, 90, 40, 50, 70};
		quicksort(arr, 0, arr.length-1);

		for(int i = 0; i < arr.length; i++)
        	System.out.print(arr[i] + " ");
	}
}


public class FindKthSmallest {

	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	


	static int kthSmallest(int[] arr, int l, int r, int k) {

		if(k > 0 && k <= r - l + 1) {

			int pivot = randomPartition(arr, l, r);

			if(pivot-l == k - 1)
				return arr[pivot];

			if(pivot-1 > k-1)
				return kthSmallest(arr, l, pivot-1, k);

			return kthSmallest(arr, pivot+1, r, k-pivot+l-1);
		}

		return Integer.MIN_VALUE;
	}

	static int partition(int[] arr, int l, int r) {

		int pivot = arr[r];
		int i = l;

		for(int j = l; j < r; j++) {
			if(arr[j] <= pivot) {
				swap(arr, i, j);
				i++;
			}
		}

		swap(arr, i, r);
		return i;
	}

	static int randomPartition(int[] arr, int l, int r) {
		int n = r - l + 1;
		int pivot = (int)(Math.random()) * (n-1);
		swap(arr, l+pivot, r);

		return partition(arr, l, r);
	}

	public static void main(String[] args) {

		System.out.println("Finding the Kth Smallest Element:");

		int[] arr = {12, 3, 5, 7, 4, 19, 26};
		int n = arr.length, k = 3;

		QuickSort sort = new QuickSort();
		sort.quicksort(arr, 0, arr.length-1);

		System.out.print("Sorted Array: ");
		for(int num: arr) {
			System.out.print(num + " ");
		}

		System.out.println();


		int kthValue = kthSmallest(arr, 0, n-1, k);
		System.out.println(k + "th value: "+ kthValue);
	}
}