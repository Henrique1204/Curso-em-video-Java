import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o valor de A: ");
		float valorA = sc.nextFloat();

		System.out.print("Digite o valor de B: ");
		float valorB = sc.nextFloat();

		System.out.print("Digite o valor de C: ");
		float valorC = sc.nextFloat();

		double delta = Math.pow(valorB, 2) - 4 * valorA * valorC;
		String raiz = delta < 0 ? "não existe raiz" : "existe raiz";

		System.out.printf("O valor de DELTA é %.2f, %s", delta, raiz);

		sc.close();
	}
}