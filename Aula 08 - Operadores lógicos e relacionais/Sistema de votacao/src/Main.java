import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a sua idade: ");
		int idade = sc.nextInt();
;
		System.out.println("A sua situa��o �: " + ((idade >= 16 && idade < 18 || idade > 70) ? "Voto opcional!" : (idade < 16) ? "Voc� ainda n�o pode votar" : "Voto obrigat�rio!"));

		sc.close();
	}
}