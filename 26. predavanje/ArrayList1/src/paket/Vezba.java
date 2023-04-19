package paket;

import java.util.ArrayList;
import java.util.List;

public class Vezba {

	public static void main(String[] args) {
		
		
		List <Integer> kolekcija = new ArrayList<Integer>();
		
		kolekcija.add(1);
		kolekcija.add(5);
		kolekcija.add(55);
		kolekcija.add(32);
		
		System.out.println("Elementi kolekcije su: ");
		for(int i : kolekcija) {
			System.out.printf("%s\t " , i);
		}
		
		System.out.println("\nDuzina kolekcije: " + kolekcija.size());
		
		
		boolean sadrzi = kolekcija.contains(5);
		
		if(sadrzi)
			System.out.println("Kolekcija sadrzi zadati element.");
		else {
			System.out.println("Kolekcija ne sadrzi zadati element. ");
		}
		
		kolekcija.remove(3);
		System.out.println("Elementi kolekcije nakon uklanjanja elementa sa indeksom 3: ");
		for(int s : kolekcija) {
			System.out.printf("%s ", s);
		}
		
		Integer [] niz = new Integer [kolekcija.size()];
		kolekcija.toArray(niz);
		System.out.print("\nElementi niza: ");
		for(int i : niz) {
			System.out.printf("%s ", i);
		}

		int pozicija = kolekcija.indexOf(55);
		
		System.out.println("\nPozicija zadatog elementa: " + pozicija);
		
		kolekcija.clear();
		System.out.println("Kolekcija ima " + kolekcija.size() + " elemenata.");
		

	}

}
