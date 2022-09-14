
import java.util.Scanner;

public class ex47_for {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		
		int num, fatorial = 1;
		
		System.out.print("Entre com um número inteiro positivo: ");
		num = ler.nextInt();
		
		for (int i = 1; i <= num; i++) {
			fatorial *= i;
		}
		System.out.printf("O resultado fatorial do número %d é %d!", num, fatorial);
}
}