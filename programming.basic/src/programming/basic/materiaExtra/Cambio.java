package programming.basic.materiaExtra;

import java.util.Scanner;

//3. Leia um valor em real e a cota��o do d�lar. Em seguida, imprima o valor correspondente em
//d�lares.
public class Cambio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		double real, dolar, cota��o = 4.5;

		System.out.println("Please enter how much real do you want in to change in dollar.");
		real = input.nextDouble();

		dolar = real / cota��o;

		System.out.println("Your value in dollar will be " + dolar);

	}

}
