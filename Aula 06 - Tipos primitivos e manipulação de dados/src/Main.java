import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.print("Digite o nome do aluno: ");
		String nome = teclado.nextLine();

		System.out.printf("Digite a nota de %s: ", nome);
		float nota = teclado.nextFloat();

		int idade = 30;
		String valor = Integer.toString(idade);

		System.out.println("De int para String: " + valor);

		int idade2 = Integer.parseInt(valor);

		System.out.println("De String para int: " + idade2);

		System.out.printf("A nota de %s é %.2f \n", nome, nota);
		System.out.format("A nota de %s é %.2f", nome, nota);
	}

}
