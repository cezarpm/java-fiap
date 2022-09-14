import java.util.Scanner;

public class ex35_doWhile {

    public static void main(String[] args) {
       // Entre via teclado com um valor qualquer e imprima a tabuada de 1 a 10

         // Variáveis
            int i = 1;
            int j = 1;
            int valor = 0;

            // Entrada de dados
            Scanner entrada = new Scanner(System.in);
            

            // Processamento
            do{
                System.out.print("Entre com um valor: ");
                valor = entrada.nextInt();
            } while (valor <= 0);

            entrada.close();
            
            do {
                do {
                    System.out.println(i + " x " + j + " = " + (i * j));
                    j++;
                } while(j <= 10);

                i++;
                j = 1;
            } while(i <= valor);

    }
}
