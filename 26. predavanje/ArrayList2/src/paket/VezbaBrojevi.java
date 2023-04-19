package paket;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VezbaBrojevi {
	
	Scanner sc = new Scanner(System.in);
	
	List<Integer> brojevi = new ArrayList<Integer>();
	
	void unosbrojeva() {
		System.out.println("Unesite pozitivan broj.");
		while(true) {
			System.out.print("Broj: ");
			int num = sc.nextInt();
			if(num <= 0) {
				break;
			}
			this.brojevi.add(num);
		}
	}
		
		void ispisiBrojeve() {
			System.out.println(this.brojevi);
		
	}

}
