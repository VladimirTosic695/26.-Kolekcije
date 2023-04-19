package paket;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class VezbaMain {

	public static void main(String[] args) {
		
		String [] imena = {"Vlada", "Mika", "Sloba", "Pace", "Duca", "Deki"};
		List<String> listaImena = new ArrayList<String>();
		
		for(String ime : imena) {
			listaImena.add(ime);
		}
		
		String [] imenaZaBrisanje = {"Mika", "Pace", "Deki"};
		List<String> listaImenaZaBrisanje = new ArrayList<String>();
		
		for(String i : imenaZaBrisanje) {
			listaImenaZaBrisanje.add(i);
		}
		
		Iterator<String> it = listaImena.iterator();
		System.out.println("Lista imena: ");
		while(it.hasNext() == true) {
			System.out.print(it.next() + ", ");
		}
		
		Iterator<String> it1 = listaImena.iterator();
		System.out.println("\nLista imena posle brisanje: ");
		while(it1.hasNext())
			if(listaImenaZaBrisanje.contains(it1.next()))
				it1.remove();
		
		for(int i = 0; i< listaImena.size(); i++) {
			System.out.print(listaImena.get(i) + " ");
		}
		
		

	}

}
