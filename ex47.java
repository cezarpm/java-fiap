
import java.util.Scanner;

public class ex47 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int num, fatorial = 1;
		
		System.out.print("Entre com um número inteiro positivo: ");
		num = ler.nextInt();
		
		 while (num > 0) {
		 fatorial *= num--;
		 }
		 
		 System.out.printf("O resultado fatorial é %d!", fatorial);
		
	}

}
