package programming.basic.materiaExtra;

//1. Fa�a uma fun��o que receba dois n�meros inteiros positivos por par�metro e retorne a soma
//dos N n�meros inteiros existentes entre eles.

//2. Fa�a uma fun��o que receba um vetor de inteiros e retorne o maior valor.

//3. Fa�a uma fun��o que receba um vetor de reais e retorne a m�dia dele.
public class SumOfNumbers {

	public static void main(String[] args) {

		welcome();
		addParameter(10, 40);
		highestNumber(67, 17);
		divide(45, 7);
		multiply(56, 9);
		vectorAvg(15, 2);

	}

	public static void addParameter(int A, int B) {
		System.out.println(A + B);
	}

	public static void highestNumber(int A, int B) {
		System.out.println(Math.max(A, B));
	}

	public static void divide(int A, int B) {
		System.out.println(A / B);
	}

	public static void multiply(int X, int Y) {
		System.out.println(X * Y);
	}

	public static void welcome() {
		System.out.println("Welcome to my method practice");
	}

	public static void vectorAvg(float A, int B) {
		System.out.println(A / B);
	}

}
