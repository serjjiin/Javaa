import java.util.Scanner;

public class AliquotaINSS {
 
    public static void main (String args[]){
        // declarar variaveis
        Scanner leitor = new Scanner(System.in);

        double salario = 0;
        double aliinss = 0;

        // Entrada de dados
        System.out.print("Digite o seu salário para calcular a alíquota sobre ele: R$");
        salario = leitor.nextDouble();

        leitor.close();

        // Processamento
        if (salario <= 1100){
            aliinss = (salario * 0.075);
        } else if (salario >=1100.01 && salario <= 2203.48){
            aliinss = (salario * 0.09);
        } else if (salario >=2203.49 && salario <= 3305.22){
            aliinss = (salario * 0.12);
        } else { 
            aliinss = (salario * 0.14);
        }
        
        

        // saida de dados
        System.out.println("Com o salário de R$" + salario + " ,você pagara R$" + aliinss + " de alíquota do INSS.");

    }
}
