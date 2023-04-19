package paket;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
	/*	List<Integer> kolekcija = new ArrayList<Integer>();
		
		Klasa k1 = new Klasa(1, 50, "Jabuka");
		Klasa k2 = new Klasa(2, 100, "Kruska");
		Klasa k3 = new Klasa(3, 150, "Nar");
		
		kolekcija.add(1);
		kolekcija.add(2);
		kolekcija.add(3);
		
		Integer niz [] = new Integer [kolekcija.size()];
		kolekcija.toArray(niz);
		kolekcija.add(4);
		
		for(Integer i : niz) {
			System.out.println(i);
		}
		
		System.out.println(kolekcija);*/
		
		List <Integer> kolekcija = new ArrayList<Integer>();
		
		Integer [] niz = new Integer [10];
		
		for(int i = 0; i < 10; i++) {
			niz[i] = i + 1;
		}
		
		for(int i = 0; i < niz.length; i++) {
			kolekcija.add(niz[i]);
		}
		Integer [] niz2 = new Integer[kolekcija.size()];
		Integer [] niz3 = new Integer[kolekcija.size()];
		kolekcija.toArray(niz2);
		System.out.println("\nNiz 2: ");
		for(Integer i : niz2) {
			System.out.print(i + " ");
		}
		for(int i = 0; i < kolekcija.size(); i++) {
			niz3[i] = niz2[i] + niz[i];
		}
		System.out.println("\nNiz 3: ");
		for(int n : niz3) {
			System.out.print(n + " ");
		}
		
		
		
		for(int i : niz) {
			System.out.print(i + " ");
		}
		
		System.out.println("\nKolekcija: ");
		for(int i : kolekcija) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("Izbrisan element kolekcije: " + kolekcija.remove(5));
		System.out.println("Dohvacen element kolekcije: " + kolekcija.get(2));
		
		int zbir = kolekcija.get(2) + kolekcija.get(3);
		
		System.out.println("Zbir dva elementa: " + zbir);
		
		System.out.println("\nKolekcija: ");
		for(int i : kolekcija) {
			System.out.print(i + " ");
		}
		
/*		Scanner sc = new Scanner(System.in);
		
		
		List<String> kol = new ArrayList<String>();
		System.out.println("\nUnesite imena za String kolekciju ");
		for(int i = 0; i < 7; i++) {
			System.out.print((i+1) + ". ime: ");
			kol.add(sc.nextLine());
		}
		System.out.println("\nString kolekcija: ");
		for(String s : kol) {
			System.out.print(s + " ");
		}
		
		String par = kol.get(4) + " i " + kol.get(5);
		
		System.out.println("Par: " + par);
		System.out.println();
		if(kol.contains("vlada"))
			System.out.println("Vlada je clan kolekcije i nalazi se na poziciji " + kol.indexOf("Vlada"));
		else
			System.out.println("Vlada nije clan kolekcije");
		
		System.out.println("Duzina integer kolekcije je " + kolekcija.size());*/

	}

}
