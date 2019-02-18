import java.util.Scanner;

public class Zadatak1RolerCoaster {
	/*
	 * Napisati program koji kao argument prima jednu recenicu te vraca tu istu recenicu u RoLeR CoAsTeR caseu
	 * input: 
	 * To be, or not to be: that is the question.
	 * Output:
	 * To Be, Or NoT tO bE: tHaT iS tHe QuEsTiOn. 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Unesite jednu recenicu: ");
		Scanner input  = new Scanner(System.in);
		
		
		String recenica = input.nextLine();
		
		int counter = 0;
		String novi ="";
		for(int i = 0;i < recenica.length(); i++) {
			recenica.toLowerCase();
			if(!Character.isLetter(recenica.charAt(i))) {
				novi+=recenica.charAt(i);
				continue;
				}
			
			if(counter%2==1) {
				novi+= Character.toLowerCase(recenica.charAt(i));
				counter++;
			}
			else {
				novi+=Character.toUpperCase(recenica.charAt(i));
				counter++;
			}
		}
		System.out.println(novi);
		input.close();
		
	}

}
