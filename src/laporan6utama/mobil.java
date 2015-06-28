package laporan6utama;
import laporan6.rangka;
public class mobil {
	private rangka Rangka;
	private laporan6.mesin Mesin;
	
	public mobil(){
		Rangka = new rangka();
		Mesin = new laporan6.mesin();
		
	}
	public static void main(String[] args) {
		new mobil();
	}

}