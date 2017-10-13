package pl.coderslab.romulusmap.warsztaty1.zadanie1;

import java.util.Random;
import java.util.Scanner;

public class Gra_w_zgadywanie_liczb {

	public static void main(String[] args) {
		guessNumber();

	}

	public static void guessNumber() {

		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int generated = rand.nextInt(101);

		while(true) {
			System.out.println("Zgadnij liczbę od 1 - 100: ");
			while(!scan.hasNextInt()) {
				System.out.println("To nie jest liczba");
				scan.next();
			}int number = scan.nextInt();

			if (number == generated) {
				System.out.println("Zgadłeś!!!");
				break;
			}else if (number < generated) {
				System.out.println("Za mało!" + "\n");
			}else {
				System.out.println("Za dużo!" + "\n");
			}

		}
		scan.close();

	}

}
