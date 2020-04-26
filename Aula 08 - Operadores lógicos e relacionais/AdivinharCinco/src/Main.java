import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean cond;

		System.out.println("Estou pensando em número de 1 a 5, você consegue acertar?");
		double aleatorio = 1 + Math.random() * (5 - 1);

		do
		{
			System.out.print("Digite o seu chute: ");
			int chute = sc.nextInt();

			String msg = ( chute == Math.round(aleatorio) ) ? "   \nAcertou!" : "   \nErrado, tente outra vez!\n" ;
			System.out.println(msg);
			
			cond = ( chute == Math.round(aleatorio) ) ? false : true;
		}while(cond);

		sc.close();
	}
}