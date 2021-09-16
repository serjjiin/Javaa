import java.util.Scanner;

public class IMC {
    public static void main(String args[]) {
        Scanner leitor = new Scanner(System.in);
        
        double altura = 0;
        double peso = 0;

        double imc = 0;

        System.out.print("Qual é a sua altura em m? ");
        altura = leitor.nextDouble();

        System.out.print("Qual é o seu peso em Kg? ");
        peso = leitor.nextDouble();

        leitor.close();

        imc = peso/Math.pow(altura, 2);

        System.out.println("O seu IMC é " + imc);


    }
}
