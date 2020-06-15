package cz.spsejecna.cihak.sorts;

public class SelectSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int pole[] = new int[10];
		int x, min;
		for (int i = 0; i < (pole.length - 1); i++) {
			min = pole.length - 1;
			for (int j = i; j < (pole.length - 1); j++)
				if (pole[min] > pole[j])
					min = j;
			x = pole[min];
			pole[min] = pole[i];
			pole[i] = x;

		}

	}
}
