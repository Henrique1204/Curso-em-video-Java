import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char res = 'n';

		int vetor[] = new int[10];
		Arrays.fill(vetor, 0);

		do {

			if(conferirResposta(res))
			{
				System.out.print("Escolha a posição que quer mudar: ");
				int pos = sc.nextInt();

				System.out.print("Digite o valor que quer adicionar: ");
				int novoValor = sc.nextInt();

				atualizarVetor(vetor, pos, novoValor);
				exbirLista(vetor);

				System.out.print("\nDeseja ordenar a lista??[s/n]");
				res = sc.next().charAt(0);

				if(conferirResposta(res))
				{
					Arrays.sort(vetor);
					exbirLista(vetor);
				}
			}
			else
			{
				exbirLista(vetor);
			}

			System.out.print("\nDeseja substituir algum valor?[s/n]");
			res = sc.next().charAt(0);

		}while(conferirResposta(res));

		sc.close();
	}

	public static void exbirLista(int lista[]) {
		System.out.println("\nLISTA:");
		for(int i = 0; i < lista.length; i++) {
			System.out.println("Na posição: " + i + " | Com valor: " + lista[i]);
		}
	}

	public static boolean conferirResposta(char res) {
		return res == 's' || res == 'S' ? true : false;
	}

	public static void atualizarVetor(int vetor[], int pos, int novoValor) {
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = (i == pos) ? novoValor : vetor[i];
		}
	}
}