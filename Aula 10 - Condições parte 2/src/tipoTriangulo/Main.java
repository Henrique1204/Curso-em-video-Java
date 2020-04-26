package tipoTriangulo;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o valor do primeiro lado: ");
		int lado1 = sc.nextInt();

		System.out.print("Digite o valor do segundo lado: ");
		int lado2 = sc.nextInt();

		System.out.print("Digite o valor do terceiro lado: ");
		int lado3 = sc.nextInt();

		String eTriangulo = ((lado1 + lado2) <= lado3 || (lado1 + lado3) <= lado2 || (lado2 + lado3) <= lado1) ? "N�o forma triangulo" : "Forma triangulo" ;

		System.out.println(eTriangulo);
		if(eTriangulo == "Forma triangulo")
		{
			String tipoTriangulo = (lado1 == lado2 && lado2 == lado3) ? "Equil�tero" : (lado1 != lado2 && lado1 != lado2 && lado2 != lado3) ? "Escaleno" : "Is�sceles" ;
			System.out.println(tipoTriangulo);
		}
		

		sc.close();
	}
}