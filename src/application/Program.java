package application;

import java.util.Locale;
import java.util.Scanner;
import util.Bill;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
        do {
		System.out.print("Sexo (m/f):");
		Bill.gender = sc.next().charAt(0);
        }while(Bill.gender!='m' && Bill.gender!='f');

		System.out.print("Quantidade de cervejas: ");
		Bill.beer = sc.nextInt();

		System.out.print("Quantidade de refrigerantes: ");
		Bill.softDrink = sc.nextInt();

		System.out.print("Quantidade de espetinhos: ");
		Bill.barbecue = sc.nextInt();

		System.out.println();

		System.out.println("RELATÓRIO:");

		System.out.printf("Consumo: R$ %.2f %n", Bill.feeding());

		if (Bill.cover() == 0) {
			System.out.println("Isento de Couvert.");
		} else {
			System.out.printf("Couvert: R$ %.2f %n", Bill.cover());

		}
		System.out.printf("Ingresso: R$ %.2f %n", Bill.ticket());

		System.out.println();

		System.out.printf("Valor a pagar: R$ %.2f %n", Bill.total());

		sc.close();

	}

}
