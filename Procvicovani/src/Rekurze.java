
public class Rekurze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(faktorialSmycka(5));
		System.out.println(faktorialRekurze(5));

	}

	public static int faktorialSmycka(int cislo) {
		for (int i = cislo - 1; i > 0; i--) {
			cislo *= i;

		}
		return cislo;
	}

	public static int faktorialRekurze(int cislo) {
		if (cislo == 1) {
			return 1;
		} else {
			return cislo * faktorialRekurze(cislo - 1);
		}
	}
	/*zde bych doporucil dat staticke metody do samostatne tridy, aby byl main prehledny a lepe se mohl projekt
	 * upravovat, ale jinak se mi metody libi, spise bych chtel videt lepsi vyuziti. Jako napriklad
	 * v sortech jako merge sort nebo quick sort, ale chapu, ze toto je pouze procvcovani urcite latky a nikoliv
	 * primo praxe.
	 */
}
