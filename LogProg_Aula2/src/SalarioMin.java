import java.util.Scanner;

public class SalarioMin {

    public static void main (String args[]) {
        //DECLARAÇÃO DE VARIAVEIS
        Scanner leitor = new Scanner(System.in);

        double salario = 0;
        double quant = 0;
        double min = 1100;

        // ENTRADA DE DADOS
        System.out.print("Digite seu salário: ");
        salario = leitor.nextDouble();

        leitor.close();

        //PROCESASMENTO
        quant = (salario / min);

        // SAIDA DE DADOS
        System.out.println("O seu salário equivale a " + quant + " salário(s) mínimos.");


    }
}
