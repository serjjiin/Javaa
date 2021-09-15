import java.util.Scanner;

public class QuantidadeSegundos {
    public static void main (String args[]){
        // Declarando variaveis
        Scanner leitor = new Scanner(System.in);

        double entrada = 0;
        double escolha = 0;
        double res = 0;

        // Entrada de dados
        System.out.println("Programa de calculo de segundos");
        System.out.print("Digite 1 para colocar em minutos e 2 para horas.");
        escolha = leitor.nextDouble();

        System.out.print("Digite agora o número a ser convertido: ");
        entrada = leitor.nextDouble();


        leitor.close();
        // Processamento 
        if (escolha == 1) {
            res = entrada * 60;
            System.out.println(entrada + " minutos é " + res + " segundos.");

        } else if (escolha == 2) {
            res = entrada * 3600;
            System.out.println(entrada + " horas é " +res + " segundos.");
        } else {
            System.out.println("Digite 1 ou 2!!");
        }
    }
}
