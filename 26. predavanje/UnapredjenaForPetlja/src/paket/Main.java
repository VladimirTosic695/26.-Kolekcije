package paket;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	/*	int niz [] = {2,5,7,9,29};
		
		System.out.println("Stampanje elemenata niza for petlje: ");
		for(int i = 0; i < niz.length; i++) {
			System.out.println(niz[i]);
		}
		
		
		System.out.println("\nStampanje elemenata niza unapredjenom for petljom: ");
		
		for(int i : niz) {
			System.out.println(i);
		}*/
		
		Scanner sc = new Scanner(System.in);
		int niz1 [] = new int [5];
		
		for(int i : niz1) {
			System.out.println("Unesite element: ");
			niz1[i] = sc.nextInt();
		}
		
		for(int i : niz1) {
			System.out.println(i);
		}
		
	}

}
