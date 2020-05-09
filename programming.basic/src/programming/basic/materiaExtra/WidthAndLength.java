package programming.basic.materiaExtra;

import java.util.Scanner;

//2. Faça um programa para ler as dimensões de um terreno (comprimento c e largura l), bem como
//o preço do metro de tela p. Imprima o custo para cercar este mesmo terreno com tela.
public class WidthAndLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double C, L, P, unitValue = 1.2;

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter the length of your property.");
		L = input.nextDouble();

		System.out.println("Please enter the width of your property");
		C = input.nextDouble();

		P = unitValue * (L * C);

		System.out.printf("The price of fencing your house is %2f", P);

	}

}
