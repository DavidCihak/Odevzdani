package cz.spsejecna.cihak.dedicnost;

public class Savec {
	private int vek;
	private int vaha;

	public Savec() {
		System.out.println("Savec.");
		vek = 5;
		vaha = 3;
	}
	/* V prvnim rocniku jsme se ucili, ze maji byt minimalne 2 konstruktory a to konstruktory bez a s parametry,
	 * proto bzch doporucil udelat jeste druhy, ale chapu ze to nebyla hlavni myslenka prace.
	 * pr:
	 * public Savec(int vek, int vaha){
	 * this. vaha=vaha;
	 * this.vek=vek;
	 * }
	 */

	public void pohyb() {
		System.out.println("Pes se pohybuje.");

	}

	public int getVek() {
		return vek;
	}

	public void setVek(int vek) {
		this.vek = vek;
		/*pan reditel nam rikal, ze takovyto set neni uplne spravny, protoze je lehce chybovostni,
		 * proto bzch doporucil udelat lehce jiny:
		 *public void setVek(int vek)throw Exception{
		 *if(this.vek<0){
		 *throw new Exception}else{
		 *this.vek=vek;
		 *}}
		 *to same u druheho setu s tim, ze jeste musime upravit classu a dopsat throws Exception
		 */
	}

	public int getVaha() {
		return vaha;
	}

	public void setVaha(int vaha) {
		this.vaha = vaha;
	}
}
