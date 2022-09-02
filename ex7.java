
import java.util.Scanner;

public class ex7 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double produto1, produto2, produto3, produto4, produto5, valorTotal, valorPago, valorTroco;

		System.out.printf("Digite o valor do produto: ");
		produto1 = ler.nextDouble();

		System.out.printf("Digite o valor do produto: ");
		produto2 = ler.nextDouble();

		System.out.printf("Digite o valor do produto: ");
		produto3 = ler.nextDouble();

		System.out.printf("Digite o valor do produto: ");
		produto4 = ler.nextDouble();

		System.out.printf("Digite o valor do produto: ");
		produto5 = ler.nextDouble();

		valorTotal = produto1 + produto2 + produto3 + produto4 + produto5;

		System.out.printf("O valor total � R$%s", valorTotal);

		System.out.printf("Digite o valor a ser pago: ");

		valorPago = ler.nextDouble();

		valorTroco = valorPago - valorTotal;

		System.out.printf("O troco � R$%s ", valorTroco);

		ler.close();
	}

}
