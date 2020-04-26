import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o valor: ");
		int valor = sc.nextInt();

		System.out.printf("O resti da divisão do número por 2 é %d%n", (valor % 2));
		System.out.format("Elevado ao quadrado %.2f%n", Math.pow(valor, 2));
		System.out.printf("A raiz quadrada é %.2f%n", Math.sqrt(valor));
		System.out.format("A raiz cúbica %.2f%n", Math.cbrt(valor));
		System.out.printf("O valor absoluto é %d", Math.abs(valor));

		sc.close();
	}
}