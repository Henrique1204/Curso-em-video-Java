import java.awt.Dimension;
import java.awt.Toolkit;

public class Main {

	public static void main(String[] args) {
		Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();

		System.out.print("Dimens�es: " + tela.width + " X " + tela.height);
	}

}
