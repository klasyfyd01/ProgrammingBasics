package programming.basic.materiaExtra;
//Fa�a um programa que pergunte o pre�o de tr�s produtos e informe qual produto voc� deve

//comprar, sabendo que a decis�o � sempre pelo mais barato.

import java.util.Scanner;

public class CheapestProduct {

	public static void main(String[] args) {

		double firProduct, secproduct, thirPoduct;

		Scanner input = new Scanner(System.in);

		System.out.println("Type in the price of the first product");
		firProduct = input.nextDouble();
		secproduct = input.nextDouble();
		thirPoduct = input.nextDouble();

		if (firProduct < secproduct && firProduct < thirPoduct) {
			System.out.printf("The cheapest product is " + firProduct);
		} else if (secproduct < firProduct && secproduct < thirPoduct) {
			System.out.printf("The cheapest product is " + secproduct);
		} else if (thirPoduct < secproduct && thirPoduct < firProduct) {
			System.out.printf("The cheapest product is " + thirPoduct);
		}

	}

}
