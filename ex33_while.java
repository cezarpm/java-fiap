
import java.util.Scanner;

public class ex33_while {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        char sexo;

        System.out.printf("Digite o sexo (F ou M): ");
        sexo = ler.next().charAt(0);

        while (sexo != 'F' && sexo != 'M') {
            System.out.printf("Digite o sexo (F ou M): ");
            sexo = ler.next().charAt(0);
        }

        System.out.print(sexo);

        ler.close();

    }
}
