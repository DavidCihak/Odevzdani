import java.util.Scanner;

public class Enumenatory {
	enum Barvy {
		CERVENA, ZELENA, MODRA
	};

	//zde asi nemám co opravovat pouze rici, ze se mi libi sjednoceni jak tridy Barvy i Main do jedne classy
	//a rici ze enumy se daji velice dobre vyuzivat na ruzne veci, pokud chceme sve vlstni datove typy.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Napiš jakou z tìchto barev máš rád?");
		System.out.println("Èervenou");
		System.out.println("Zelenou");
		System.out.println("Modrou");
		Barvy barvicka = null;
		String vyber = sc.nextLine();
		switch (vyber) {

		case "Èervenou":
			barvicka = Barvy.CERVENA;

			break;
		case "Zelenou":
			barvicka = Barvy.ZELENA;
			break;
		case "Modrou":
			barvicka = Barvy.MODRA;
			break;

		}

		System.out.println("Tvoje oblíbená barva je " + barvicka);

	}

}
