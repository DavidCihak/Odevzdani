package cz.spsejecna.cihak.sorts;

public class MergeSort {
	public static void mergeSort(int[] pole, int[] x, int left, int right) {
		if (left == right)
			return;
		int stred = (left + right) / 2;
		mergeSort(pole, x, left, stred);
		mergeSort(pole, x, stred + 1, right);
		merge(pole, x, left, right);
		for (int i = left; i <= right; i++) {
			pole[i] = x[i];
		}
	}

	private static void merge(int[] pole, int[] x, int left, int right) {
		int stred = (left + right) / 2;
		int leftIndex = left;
		int rightIndex = stred + 1;
		int xIndex = left;
		while (leftIndex <= stred && rightIndex <= right) {
			if (pole[leftIndex] >= pole[rightIndex]) {
				x[xIndex] = pole[leftIndex++];
			} else {
				x[xIndex] = pole[rightIndex++];
			}
			xIndex++;
		}
		while (leftIndex <= stred) {
			x[xIndex] = pole[leftIndex++];
			xIndex++;
		}
		while (rightIndex <= right) {
			x[xIndex] = pole[rightIndex++];
			xIndex++;
		}

	}
}
