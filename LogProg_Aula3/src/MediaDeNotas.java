import java.util.Scanner;

public class MediaDeNotas {
    public static void main(String args[]) {
        Scanner leitor = new Scanner(System.in);

        double nota1 = 0;
        double nota2 = 0;
        double nota3 = 0;

        double media = 0;

        System.out.print("Digite a sua primeira nota: ");
        nota1 = leitor.nextDouble();

        System.out.print("Digite a sua segunda nota: ");
        nota2 = leitor.nextDouble();

        System.out.print("Digite a sua terceira nota: ");
        nota3 = leitor.nextDouble();

        leitor.close();

        media = (nota1 + nota2 + nota3)/ 3;

        System.out.println("A sua média foi " + media);


    }
}
