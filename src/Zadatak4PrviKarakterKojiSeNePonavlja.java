import java.util.Scanner;

public class Zadatak4PrviKarakterKojiSeNePonavlja {
	/*
	 * Napisati program koji pita korisnika da unese string, a zatim pronalazi i ispisuje prvi
	 * karakter koji se ne ponavlja u ostatku stringa.
	 * Input:
	 * bubble
	 * Output:
	 * u
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Unesite neki string: ");
		Scanner input = new Scanner(System.in);
		
		String unos = input.nextLine();
		
	petlja:	for(int i = 0; i < unos.length(); i++) {
			char ch = unos.charAt(i);
			for(int j = i + 1; j < unos.length(); j++) 
				if(ch == unos.charAt(j)) 
					continue petlja;
					
			System.out.println("Prvi karakter koji se ne pojavljuje u ostatku stringa je: " + ch);
			break;
							
				}	
		input.close();

	}
}
