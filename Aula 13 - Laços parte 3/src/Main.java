import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite por onde quer começar: ");
		int ini = sc.nextInt();

		System.out.print("Digite até onde quer ir: ");
		int fim = sc.nextInt();

		System.out.print("Digite o valor do passo: ");
		int passo = sc.nextInt();

		passo = (passo == 0) ? 1 : passo;
		passo *= (ini > fim ^ passo < 0) ? -1 : 1;
		fim += passo;

		for(int i = ini; i != fim; i += passo) {
			System.out.println(i);
		}

		sc.close();
	}

}