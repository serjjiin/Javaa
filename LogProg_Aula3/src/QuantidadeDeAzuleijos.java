import java.util.Scanner;

public class QuantidadeDeAzuleijos {
    public static void main(String args[]) {
        // delcarar 
        Scanner leitor = new Scanner(System.in);

        double azul = 0;
        double profundidade = 0;
        double lado1 = 0;
        double lado2 = 0;

        double areaAzul = 0;
        double areaP = 0;
        double quantidadeAzul = 0;

        // entrada de dados
        System.out.print("Qual o tamanho dos azuleijos?  ");
        azul = leitor.nextDouble();

        System.out.print("Qual a profundidade da pscina?  ");
        profundidade = leitor.nextDouble();

        System.out.print("Qual a largura? ");
        lado1 = leitor.nextDouble();

        System.out.print("Qual o comprimento? ");
        lado2 = leitor.nextDouble();

        leitor.close();

        // processamento
        areaAzul = azul * azul ;
        areaP = (2 * (lado1 * profundidade) + 2 * (lado2 * profundidade) + (lado1 * lado2));
        quantidadeAzul = areaP / areaAzul;

        // saida de dados

        System.out.println("Ira precisar de " + quantidadeAzul + " de azuleijos para cobrir a sua pscina");


    }
    
}
