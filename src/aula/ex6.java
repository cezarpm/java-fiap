package aula;

import java.util.Scanner;

public class ex6 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double cotacaoDolar, valorEmDolar, valorEmReal;		
		
		System.out.printf("Digite a cotação atual do Dólar: ");
		cotacaoDolar = ler.nextDouble();
		
		System.out.printf("Digite o valor em Dólar: ");
		valorEmDolar = ler.nextDouble();
		
		valorEmReal = cotacaoDolar * valorEmDolar;
	
		System.out.printf("O valor em Real é R$$%.2f ", valorEmReal);
		ler.close();
	}

}
