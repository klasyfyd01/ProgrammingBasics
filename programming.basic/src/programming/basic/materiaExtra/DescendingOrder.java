package programming.basic.materiaExtra;

import java.util.Scanner;

//2. Faça um Programa que leia três números e mostre-os em ordem decrescente.
public class DescendingOrder {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int n1, n2, n3;

		System.out.println("Enter your three numbers");
		n1 = input.nextInt();
		n2 = input.nextInt();
		n3 = input.nextInt();

		if (n1 < n2 && n1 < n3) {
			System.out.printf("Your numbers in descending order is %d, %d, %d", n1, n2, n3);
		} else if (n2 < n1 && n2 < n3) {
			System.out.printf("Your numbers in descending order is %d, %d, %d", n2, n3, n1);
		} else if (n3 < n1 && n3 < n2) {
			System.out.printf("Your numbers in descending order is %d, %d, %d", n3, n2, n1);
		}
		
	}

}
