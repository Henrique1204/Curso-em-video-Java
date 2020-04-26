import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a sua idade: ");
		int idade = sc.nextInt();
;
		System.out.println("A sua situação é: " + ((idade >= 16 && idade < 18 || idade > 70) ? "Voto opcional!" : (idade < 16) ? "Você ainda não pode votar" : "Voto obrigatório!"));

		sc.close();
	}
}