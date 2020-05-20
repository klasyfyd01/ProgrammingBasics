package programming.basic.materiaExtra;
//1. Leia um valor de área em metros quadrados m2 e apresente-o convertido em hectares. A
//fórmula de conversão é: H = M ∗ 0,0001, sendo M a área em metros quadrados e H a área em
//hectares.
import java.util.Scanner;

public class measuringArea {

	public static void main(String[] args) {
		double M, H;
		
		Scanner entry = new Scanner(System.in);
		
		System.out.println("Please type an area in metres");
		M = entry.nextDouble();
		
		H = M * 0.0001;
		
		System.out.printf("Your area in hectares is " + H);
		
	        
	        
	}

}
