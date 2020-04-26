import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fat = 1;

		System.out.print("Digite o valor que você quer saber o fatorial: ");
		int valor = sc.nextInt();
		
		String msg = (valor == 0) ? "O fatorial de " + valor : "";

		while(valor >= 1) {
			fat *= valor;

			msg += (fat == valor) ? "O fatorial de '" + valor + "' é: " + valor : " X " +  valor ;
			msg = (fat == 1) ? "O fatorial de " + valor : msg;

			valor--;
		}

		System.out.println(msg + " = " + fat);

		sc.close();
	}
}