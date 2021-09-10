import static java.lang.Math.PI;
import java.util.Scanner;

public class VolumeEsdera {
    public static void main (String args[]){
        // Declarando variaveis
        Scanner leitor = new Scanner(System.in);
        
        double volume = 0;
        double pi = PI;
        double raio = 0;

        // Entrada de dados
        System.out.print("Qual é o raio da esfera? ");
        raio = leitor.nextDouble();

        leitor.close();

        // Processamento
        volume = ((4*pi)*(Math.pow(raio, 3)))/3;

        // Saida de dados
        System.out.println("A esfera de raio " + raio + " tem volume de " + volume);

    }
}

