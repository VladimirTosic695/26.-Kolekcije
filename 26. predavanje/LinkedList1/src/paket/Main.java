package paket;

import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<String> ll = new LinkedList<String>();
		
		// Dodavanje elemenata u povezanoj listi
		
		ll.add("A"); // indeks 0
		ll.add("B"); // indeks 1
		ll.add(2, "C"); // indeks 2
		
		System.out.println("Elementi povezane liste su: " + ll);
		
		// Brisanje elementa iz povezane liste
		
		ll.remove(0); // preko indeksa
		ll.remove("B"); // preko vrednosti
		
		System.out.println("Povezana lista nakon brisanja elemenata: " + ll);
		
		ll.add("D");
		ll.add("E");
		ll.add("F");
		
		System.out.println("Elementi povezane liste su: " + ll);
		
		//Trazenje elemenata u povezanoj listi
		
		boolean sadrzi = ll.contains("E");
		
		if(sadrzi == true)
			System.out.println("Lista sadrzi element E.");
		else 
			System.out.println("Lista ne sadrzi element E.");
		
		// Pristupanje (uzimanje) vrednosti elementa iz povezane liste
		
		Object element = ll.get(3);
		System.out.println("Trazen element je: " + element);
		
		// Postavljanje elementa u povezanoj listi
		
		ll.set(1, "Z");
		System.out.println("Povezana lista nakon promene: " + ll);
		
		
	}

}
