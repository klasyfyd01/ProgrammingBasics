package programming.basic.materiaExtra;

import java.util.Scanner;

//3. Leia um valor em real e a cotação do dólar. Em seguida, imprima o valor correspondente em
//dólares.
public class Cambio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		double real, dolar, cotação = 4.5;

		System.out.println("Please type in how much real do you want in to change in dollar.");
		real = input.nextDouble();

		dolar = cotação * real;

		System.out.printf("Your value in dollar will be %2f", dolar);

	}

}
