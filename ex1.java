
import java.util.Scanner;

public class ex1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double base, altura, area;

		System.out.printf("Digite o valor da base: ");
		base = ler.nextDouble();

		System.out.printf("Digite o valor da altura: ");
		altura = ler.nextDouble();

		area = base * altura;

		System.out.printf("A area do retangulo é %s", area);
		ler.close();
	}

}
