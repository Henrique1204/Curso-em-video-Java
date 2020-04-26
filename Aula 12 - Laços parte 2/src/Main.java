import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valor = 0, total = 0, pares = 0, impares = 0, acima100 = 0, media = 0, soma = 0;

		System.out.print("Digiete o valor: ");
		valor = sc.nextInt();

		while(valor != 0){

			total++;
			pares += valor % 2 == 0 ? 1 : 0;
			impares += valor % 2 == 1 ? 1 : 0;
			acima100 += valor > 100 ? 1 : 0;
			soma += valor;
			media = soma / total;

			System.out.print("Digiete mais um valor: ");
			valor = sc.nextInt();
		}

		System.out.println("\nRESULTADO:");
		System.out.println("=======================");
		System.out.println("Total de valores: " + total);
		System.out.println("Total de pares: " + pares);
		System.out.println("Total de impares: " + impares);
		System.out.println("Acima de 100: " + acima100);
		System.out.println("Média dos valores: " + media);

		sc.close();
	}
}