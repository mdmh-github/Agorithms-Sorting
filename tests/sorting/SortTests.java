package tests.sorting;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

import algorithms.sorting.Sorting;

public abstract class SortTests {

	protected Sorting algorithm;

	@Test
	public void validateSingleElement() {
		validate(new int[] { 3 }, new int[] { 3 });
	}

	@Test
	public void validatePermutationsWithDuplicates() {
		validate(new int[] { 3, 1, 2, 2 }, new int[] { 1, 2, 2, 3 });
		validate(new int[] { 2, 3, 1, 1 }, new int[] { 1, 1, 2, 3 });
		validate(new int[] { 1, 3, 3, 2 }, new int[] { 1, 2, 3, 3 });
	}

	@Test
	public void validatePermutations() {
		validate(new int[] { 1, 3, 2 }, new int[] { 1, 2, 3 });
		validate(new int[] { 2, 1, 3 }, new int[] { 1, 2, 3 });
		validate(new int[] { 2, 3, 1 }, new int[] { 1, 2, 3 });
		validate(new int[] { 3, 1, 2 }, new int[] { 1, 2, 3 });
		validate(new int[] { 3, 2, 1 }, new int[] { 1, 2, 3 });
	}

	@Test
	public void validateAlreadyOrdered() {
		validate(new int[] { 1 }, new int[] { 1 });
		validate(new int[] { 1, 2 }, new int[] { 1, 2 });
		validate(new int[] { 1, 2, 3 }, new int[] { 1, 2, 3 });
	}

	@Test
	public void validateEmptyCase() {
		validate(new int[] {}, new int[] {});
	}

	protected void validate(int[] input, int[] outputExpected) {

		int[] resultingArray = algorithm.Sort(input);
		boolean areEquals = Arrays.equals(resultingArray, outputExpected);

		print(outputExpected);
		print(resultingArray);

		System.out.println(areEquals + " ");
		Assert.assertTrue(areEquals);
	}

	private void print(int[] input) {
		for (int n : input)
			System.out.print(n + " ");
		System.out.println();
	}
}
