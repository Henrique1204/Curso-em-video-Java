public class Program {
	public static void main(String[] args) {
		String meses[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
		int dias[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		for(int i = 0; i < 12; i++) {
			System.out.println("Mês '" + meses[i] + "' tem '" + dias[i] + "' dias.");
		}
	}
}