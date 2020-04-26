public class Main {
	public static void main(String[] args) {
		int i = 0;

		while(i < 10) {
			i++;
			if(i % 2 == 0) {
				continue;
			}
			System.out.println("Contador vale: " + i);
		}

		i = 0;
		while(i < 10) {
			i++;
			if(i == 5) {
				break;
			}
			System.out.println("Contador vale: " + i);
		}
	}
} 