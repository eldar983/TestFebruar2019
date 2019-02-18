import java.util.Scanner;

public class Zadatak5ParoviBrojevaNizaSumaJednakaBrojuX {
	/*
	 * Napisati program koji pita korisnika da unese niz od 5 cijelih brojeva i broj X,
	 * a zatim ispisuje sve parove brojeva iz niza cija je suma jednaka broju X
	 * input:
	 * Unesite niz: 1 2 3 4 6
	 * Unesite broj X: 5
	 * 
	 * Output:
	 * (1,4)
	 * (2,3)
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesite niz od 5 cijelih brojeva: ");
		
		int [] niz = new int [5];
		
		for (int i = 0; i < niz.length; i++) {
		    niz[i] = input.nextInt();
		}
		
		System.out.println("Unesite broj X: ");
		int brojX = input.nextInt();
		
		System.out.println("Parovi iz niza cija je suma jednaka broju X su: ");

		for(int i = 0; i < niz.length; i++) {
			for(int k = i + 1; k < niz.length; k++) {
				if((niz[i] + niz[k]) == brojX) {
					System.out.println("(" + niz[i] + "," + niz[k] + ")");			
				}
			}
		}		

		input.close();	

	}
}
