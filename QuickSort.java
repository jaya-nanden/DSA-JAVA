public class QuickSort {

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