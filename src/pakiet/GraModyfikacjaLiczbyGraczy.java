package pakiet;

import java.util.Random;
import java.util.Scanner;

public class GraModyfikacjaLiczbyGraczy {

	public static void main(String[] args) {

		Random rand = new Random();
		int los = rand.nextInt(11);
		int liczbaGraczy;

		Scanner scan7 = new Scanner(System.in); // zamknac
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);

		do {
			System.out.println(" Type number of players :");
			while (!scan7.hasNextInt()) {
				System.out.println("Sorry, bad data");
				scan7.next();
			}
			liczbaGraczy = scan7.nextInt();
		} while (liczbaGraczy <= 0);

		String gracze[] = new String[liczbaGraczy];
		int liczbaProbGraczy[] = new int[liczbaGraczy];

		int zgadywanyNumer = 11111; // zmienic petle i poprawic nazwe zmiennej

		for (int i = 1; i <= liczbaGraczy; i++) { // ++1

			System.out.println("Imie gracza numer " + i);
			gracze[i - 1] = scan.nextLine();
		}

		while (los != zgadywanyNumer) {
			int j;
			for (j = 0; j < gracze.length; j++) {
				System.out.println(" Teraz zgaduje " + gracze[j]);
				// zamknac
				System.out.println("Zgadnij liczbe o 0 do 10");
				while (!scan2.hasNextInt()) {
					System.out.println("Nie rozpoznaje tej liczby, podaj jeszcze raz");
					scan2.next();
				}
				zgadywanyNumer = scan2.nextInt();

				liczbaProbGraczy[j]++;

				if (zgadywanyNumer == los) {

					System.out.println("Wygral " + gracze[j] + "\n");

					for (int c = 0; c < gracze.length; c++) {

						System.out.println("Liczba prob gracza " + gracze[c] + " wynosi " + liczbaProbGraczy[c]);

					}

					break;

				}

				/*
				 * else if (j == gracze.length) { j = -1; }
				 */

			}

		}

		scan7.close();
		scan.close();
		scan2.close();

	}
}
