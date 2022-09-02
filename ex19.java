
import java.util.Scanner;

public class ex19 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double p1, p2, media;

		System.out.printf("Digite sua nota 1");
		p1 = ler.nextDouble();

		System.out.printf("Digite sua nota 2");
		p2 = ler.nextDouble();

		ler.close();

		media = p1 + (2 * p2) / 3;

		if (media >= 5) {
			System.out.printf("Aprovado");
		}

		if (media < 5) {
			System.out.printf("Reprovado");
		}
	}

}
