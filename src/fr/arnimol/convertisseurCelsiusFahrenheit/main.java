package fr.arnimol.convertisseurCelsiusFahrenheit;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("CONVERTISSEUR DEGRÉS CELSIUS ET DEGRÉS FAHRENHEIT");
		System.out.println("-------------------------------------------------");
		
		char redemarrage = 'O';
		while (redemarrage == 'O') {
			System.out.println("Choisissez le mode de conversion : 1 -> C à F ; 2 -> F à C");
			int modConversion = sc.nextInt();
			if (modConversion == 1) {
				System.out.println("Vous avez choisi le convertisseur Celsius - Fahrenheit");
				System.out.println("Température à convertir :");
				float temp = sc.nextInt();
				float calcul = 1.8f * temp + 32;
				System.out.println(temp + "°C correspond à " + calcul + "°F");
			} else if (modConversion == 2) {
				System.out.println("Vous avez choisi le convertisseur Fahrenheit - Celsius");
				System.out.println("Température à convertir :");
				float temp = sc.nextInt();
				float calcul = (temp - 32)*5/9;
				System.out.println(temp + "°F correspond à " + calcul + "°C");
				redemarrage = 'O';
			}
			do {
				System.out.println("Souhaitez-vous recommencer ?");
				redemarrage = sc.next().charAt(0);
			}while (redemarrage !='N' && redemarrage != 'O');
			
		}


	}

}
