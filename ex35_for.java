import java.util.Scanner;

public class ex35_for {

    public static void main(String[] args) {

         // Variáveis
            int i = 1;
            int j = 1;
            int valor = 0;

            // Entrada de dados
            Scanner entrada = new Scanner(System.in);
            System.out.print("Entre com um valor: ");
            valor = entrada.nextInt();

            while(valor < 0) {
                System.out.print("Entre com um valor: ");
                valor = entrada.nextInt();
            }
            
            entrada.close();


            // Processamento
           for(i = 1; i <= valor; i++){
            for(j = 1; j <= 10; j++){
                System.out.println(i + " x " + j + " = " + (i * j));
            }
           }

    }
}
