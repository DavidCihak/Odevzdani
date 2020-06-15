package cz.spsejecna.cihak.sorts;

public class InsertSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pole[] = new int[10];
		for (int j = 1; j < pole.length; j++) {
			int x = pole[j];
			int i = j - 1;
			while ((i > -1) && (pole[i] > x)) {
				pole[i + 1] = pole[i];
				i--;
			}
			pole[i + 1] = x;

		}

	}
}
