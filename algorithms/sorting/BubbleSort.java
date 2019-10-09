package algorithms.sorting;
public class BubbleSort implements Sorting {
	
	public int[] Sort(int[] nonSortedArray) {
		
		int[] sortedArray = (int[]) nonSortedArray.clone();
		boolean swapped = true;
		int j = 0;
		int swapNumber;
		
		while (swapped) {
			swapped = false;
			j++;
		
			for (int i = 0; i < sortedArray.length - j; i++) {
				if (sortedArray[i] > sortedArray[i + 1]) {
					swapNumber = sortedArray[i];
					sortedArray[i] = sortedArray[i + 1];
					sortedArray[i + 1] = swapNumber;
					swapped = true;
				}
			}
		}
		return sortedArray;
	}
}