public class Main {
	public static void main(String[] args) {

		String n1 = "Gustavo";

		String n2 = "Gustavo";

		String n3 = new String("Gustavo");

		String res1, res2, res3, res4;

		res1 = (n1 == n2 ) ? "igual" : "diferente";
		res2 = (n1 == n3 ) ? "igual" : "diferente";
		res3 = (n1.equals(n3) ) ? "igual" : "diferente";
		res4 = (n1 == n2 ^ n1.equals(n3)) ? "igual" : "diferente";

		System.out.println("Resposta 1 " + res1);
		System.out.println("Resposta 2 " + res2);
		System.out.println("Resposta 3 " + res3);
		System.out.println("Resposta 4 " + res4);

	}
}