
import java.util.Scanner;

public class ex2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double aresta, areaDoQuadrado;

		System.out.printf("Digite o valor da aresta: ");
		aresta = ler.nextDouble();

		areaDoQuadrado = aresta * aresta;

		System.out.printf("A area do quadrado é %.2f", areaDoQuadrado);
		ler.close();
	}
}
