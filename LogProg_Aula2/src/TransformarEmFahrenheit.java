import java.util.Scanner;

public class TransformarEmFahrenheit {
    public static void main (String args[]) {
        // DECLARAR VARIAVEIS
        Scanner leitor = new Scanner(System.in);

        double tempcel = 0;
        double fahr = 0;

        // ENTRADA DE DADOS
        System.out.print("Digite uma temperatura em Celcius: ");
        tempcel = leitor.nextDouble();

        leitor.close();

        // PROCESSAMENTO
        fahr =(((tempcel * 9)/5) + 32);

        // SAIDA DE DADOS
        System.out.println("A temperatura em " + tempcel + " Celcius, é " + fahr + " Fahrenheit.");
    }
}
