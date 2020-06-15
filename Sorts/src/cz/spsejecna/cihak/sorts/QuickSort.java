package cz.spsejecna.cihak.sorts;

public class QuickSort {
	public static void quicksort(int[] pole, int leva, int prava) {

		if (leva < prava) {

			int hranice = leva;
			for (int i = leva + 1; i < prava; i++) {
				if (pole[i] > pole[leva]) {
					vymen(pole, i, ++hranice);
				}
			}
			vymen(pole, leva, hranice);
			quicksort(pole, leva, hranice);
			quicksort(pole, hranice + 1, prava);
		}
	}

	private static void vymen(int[] pole, int leva, int prava) {
		int x = pole[prava];
		pole[prava] = pole[leva];
		pole[leva] = x;
	}
}
