package pakiet;

import java.util.Random;
import java.util.Scanner;

public class Gra {

	public static void main(String[] args) {

		int liczbaprob1 = 0;
		int liczbaprob2 = 0;
		int liczbaprob3 = 0;

		Random rand = new Random();
		int los = rand.nextInt(11);

		// System.out.println(los);

		int liczbaGracza1;
		int liczbaGracza2;
		int liczbaGracza3;

		Scanner scan = new Scanner(System.in);
		System.out.println("Jak masz na imie");
		String firstName = scan.nextLine();

		Scanner scan3 = new Scanner(System.in);
		System.out.println("Jak masz na imie");
		String secondName = scan3.nextLine();

		Scanner scan5 = new Scanner(System.in);
		System.out.println("Jak masz na imie");
		String thirdName = scan5.nextLine();

		do {

			System.out.println(" Teraz zgaduje " + firstName);
			Scanner scan2 = new Scanner(System.in);
			System.out.println("Zgadnij liczbe o 0 do 10");
			liczbaGracza1 = scan2.nextInt();
			liczbaprob1++;

			if (liczbaGracza1 == los) {
				System.out.println(
						"Wygral " + firstName + "\n" + "liczba prob gracza " + firstName + " " + liczbaprob1 + "\n");
				System.out.println("liczba prob gracza: " + secondName + " " + liczbaprob2);
				System.out.println("liczba prob gracza: " + thirdName + " " + liczbaprob3);

				break;

			}

			System.out.println(" Teraz zgaduje " + secondName);
			Scanner scan4 = new Scanner(System.in);
			System.out.println("Zgadnij liczbe o 0 do 10");
			liczbaGracza2 = scan4.nextInt();
			liczbaprob2++;

			if (liczbaGracza2 == los) {
				System.out.println(
						"Wygral " + secondName + "\n" + "liczba prob gracza " + secondName + " " + liczbaprob2);
				System.out.println("liczba prob gracza " + firstName + " " + liczbaprob1);
				System.out.println("liczba prob gracza " + thirdName + " " + liczbaprob3);

				break;

			}

			System.out.println(" Teraz zgaduje " + thirdName);
			Scanner scan6 = new Scanner(System.in);
			System.out.println("Zgadnij liczbe o 0 do 10");
			liczbaGracza3 = scan6.nextInt();
			liczbaprob3++;

			if (liczbaGracza3 == los) {
				System.out
						.println("Wygral " + thirdName + "\n" + "liczba prob gracza " + thirdName + " " + liczbaprob3);
				System.out.println("liczba prob gracza: " + firstName + " " + liczbaprob1);
				System.out.println("liczba prob gracza: " + secondName + " " + liczbaprob2);

				break;

			}

		} while (los != liczbaGracza1 && los != liczbaGracza2 && los != liczbaGracza3);

	}

}
