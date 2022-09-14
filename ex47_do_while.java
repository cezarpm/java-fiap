
import java.util.Scanner;

public class ex47_do_while {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		
        int num, fat = 1, cont = 1;

        do{
            System.out.printf("Digite o valor que deseja fatorar: ");
            num = ent.nextInt();
            
            for(int i = 1;i <= num; i++){
                fat = fat * i;
            }
            
            System.out.printf("O resultado fatorial do número %d é %d!", num, fat);
            cont++; 
            }while(cont < 2);
 }
}