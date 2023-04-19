package paket;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<String> kolekcija = new ArrayList<>();
		
		// size - vraca broj elemenata smestenih u kolekciji ArrayList
		
		System.out.println("Pocetna duzina: "+ kolekcija.size());
		
		// add() - dodaje element na kraju kolekcije
		
		kolekcija.add("prvi element");
		kolekcija.add("drugi element");
		kolekcija.add("treci element");
		kolekcija.add("cetvrti element");
		
		for(String s : kolekcija)
			System.out.printf("%s\t ", s);
		
		System.out.println("\nTrenutna duzina: "+ kolekcija.size());
		
		// provera da li se zadati element nalazi unutar kolekcije
		// za to postoji funkcija contains
		//contains - ona vraca true ako sadrzi ili false ako kolekcija ne sadrzi element
		
		boolean sadrzi = kolekcija.contains("treci element");
		
		if(sadrzi) {
			System.out.println("Kolekcija sadrzi trazeni element.");
		} else {
			System.out.println("Kolekcija ne sadrzi trazeni element.");
		}
		
		// get() - metoda koja vraca element sa zadatim indeksom
		String element = kolekcija.get(2);
		
		System.out.println("Element sa indeksom 2 u kolekciji je: " + element);
		
		// indexOf() - vraca indeks prve pojave zadatog elementa kolekcije
		// vratice -1 ukoliko trazeni element ne postoji
		
		int pozicija = kolekcija.indexOf("drugi element");
		
		System.out.println("Pozicija trazenog elementa: " + pozicija);
		
		// toArray - sluzi za prebacivanje elemenata u niz
		
		String [] nizString = new String[kolekcija.size()];
		
		kolekcija.toArray(nizString);
		
		for(String s : nizString) {
			System.out.printf("String:%s \t", s);
		}
		
		// remove - brise prvu pojavu zadate vrednosti
		
		kolekcija.remove("treci element");
		System.out.println("\nKolekcija nakon uklanjanja elementa: ");
		for(String s : kolekcija) {
			System.out.printf("%s \t", s);
		}
		
		// clear - brise sve elemente kolekcije
		kolekcija.clear();
		System.out.println("\nTrenutna duzina kolekcije(nakon brisanja): " + kolekcija.size());
		
		
		
	}

}
