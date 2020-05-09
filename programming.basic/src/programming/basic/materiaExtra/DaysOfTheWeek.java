package programming.basic.materiaExtra;

import java.util.Scanner;

//3. Faça um Programa que leia um número e exiba o dia correspondente da semana. (1-Domingo,
//2- Segunda, etc.), se digitar outro valor deve aparecer valor inválido.
public class DaysOfTheWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Please type in a number between 1 & 7");
		int num = sc.nextInt();

		switch (num) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Invalid input");
		}
	}

}
