package paket;

public class Klasa {
	
	int barkod;
	double cena;
	String proizvod;
	
	Klasa(int barkod, double cena, String proizvod){
		this.barkod = barkod;
		this.cena = cena;
		this.proizvod = proizvod;
	}
	public int getBarkod() {
		return barkod;
	}
	public double getCena() {
		return cena;
	}
	public String getProizvod() {
		return proizvod;
	}
	

	

}
