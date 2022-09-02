
import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double valor1, valor2, valor3, valor4, media;

		System.out.printf("Digite o valor: ");
		valor1 = ler.nextDouble();

		System.out.printf("Digite o valor: ");
		valor2 = ler.nextDouble();

		System.out.printf("Digite o valor: ");
		valor3 = ler.nextDouble();

		System.out.printf("Digite o valor: ");
		valor4 = ler.nextDouble();

		media = (valor1 + valor2 + valor3 + valor4) / 4;

		System.out.printf("A m�dia dos valores � %.2f", media);
		ler.close();

	}

}
