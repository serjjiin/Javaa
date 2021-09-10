import java.io.PrintStream;
import java.util.Scanner;

public class CalculadoraBasica {
    /**
     *
     */
    private static final PrintStream OUT = System.out;

    public static void main (String args[]) {
        // Declaração de variáveis
        Scanner leitor = new Scanner(System.in);

        float numero1 = 0;
        float numero2 = 0;

        float soma = 0;
        float subtracao = 0;
        float multi = 0;
        float divi = 0;
        float rest = 0;


        // Entrada de dados
        OUT.print("Digite um número: ");
        numero1 = leitor.nextInt();

        OUT.print("Digite outro número: ");
        numero2 = leitor.nextInt();

        leitor.close();

        // Processamento
        soma = (numero1 + numero2);
        subtracao = (numero1 - numero2);
        multi = (numero1 * numero2);
        divi = (numero1 / numero2);
        rest = (numero1 % numero2);
    
        // Saída de dados
        OUT.println("o resultado da soma é: " + soma);
        OUT.println("O resultado da subtração é: " + subtracao);
        OUT.println("O resultado da * é: " + multi);
        OUT.println("O resultado da / é: " + divi);
        OUT.println("O resultado do % é: " + rest);

    }
}