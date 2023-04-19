package paket;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		String imena [] = {"Mika", "Zika", "Ana","Hana","Lana","Una"};
		
		List<String> listaImena = new ArrayList<String>();
		
		for(String ime : imena) {
			listaImena.add(ime);
		}
		
		String ImenaZaBrisanje [] = {"Mika","Lana","Hana"};
		
		List<String> listaImenaZaBrisanje = new ArrayList<String>();
		
		for(String s : ImenaZaBrisanje) {
			listaImenaZaBrisanje.add(s);
		}
		
		// kreiranje iteratora kolekcije i stampanje liste pomocu iteratora
		
		Iterator<String> iter = listaImena.iterator();
		System.out.println("Stapanje elemenata pomocu iteratora: ");
		while(iter.hasNext()) {
			System.out.print (iter.next() + " ");
		}
		
		iter = listaImena.iterator();
		while(iter.hasNext())
			if(listaImenaZaBrisanje.contains(iter.next()))
				iter.remove();
		
		System.out.println("\nLista nakon brisanja: ");
		for(int i = 0; i < listaImena.size(); i++)
			System.out.print(listaImena.get(i) + " ");

	}

}
