package programming.basic.materiaExtra;

import java.util.Scanner;

//1. Fa�a um programa que pe�a um n�mero inteiro e determine se ele � ou n�o um n�mero primo.
//Um n�mero primo � aquele que � divis�vel somente por ele mesmo e por 1.
public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numero;
		boolean isPrime = true;

		System.out.println("Please e number");
		numero = sc.nextInt();

		for (int i = 2; i <= numero / 2; i++) {
			if (numero % 2 == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime)
			System.out.println("Is a prime number" + numero);
		else
			System.out.println("Is not a prime number" + numero);

	}

}
