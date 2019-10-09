package algorithms.sorting;

public class QuickSort implements Sorting {

	public int[] Sort(int[] nonSortedArray) {

		int low = 0;
		int high = nonSortedArray.length - 1;

		return quickSort(nonSortedArray, low, high);
	}

	private int[] quickSort(int[] arr, int low, int high) {

		if (arr == null || arr.length == 0 || low >= high)
			return arr;

		// pick the pivot
		int middle = low + (high - low) / 2;
		int pivot = arr[middle];

		// make left < pivot and right > pivot
		int i = low;
		int j = high;

		while (i <= j) {
			while (arr[i] < pivot)
				i++;

			while (arr[j] > pivot)
				j--;

			if (i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}

		// recursively sort two sub parts
		if (low < j)
			quickSort(arr, low, j);

		if (high > i)
			quickSort(arr, i, high);

		return arr;
	}
}
