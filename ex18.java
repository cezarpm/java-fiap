package ddd;

import java.util.Scanner;

public class ex18 {

	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		
		double velocidadeInicial, aceleracao, tempoPercurso, velocideFinal; 
		
		System.out.printf("Qual a valocidade inicial? ");
		velocidadeInicial = ler.nextDouble();
		
		System.out.printf("Qual a aceleração? ");
		aceleracao = ler.nextDouble();
		
		System.out.printf("Qual o tempo de percurso? ");
		tempoPercurso = ler.nextDouble();
		
		ler.close();
		
		velocideFinal = (velocidadeInicial + (aceleracao * tempoPercurso)) * 3.6;
		
		
		if(velocideFinal > 120){
			System.out.printf("Veiculo muito rápido");
		}
		
		else if(velocideFinal > 80){
			System.out.printf("Veículo rápido");
		}
		
		else if(velocideFinal > 60){
			System.out.printf("Velocidade de cruzeiro");
		}
		
		else if(velocideFinal > 40){
			System.out.printf("A velocidade permitida");
		}
		
		else {
			System.out.printf("Veículo muito lento");
		}
	}
}
