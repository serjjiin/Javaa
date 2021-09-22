import java.util.Scanner;

public class PercentualVotos {
    public static void main (String args[]) {
        Scanner leitor = new Scanner(System.in);

        double qtdVotosA = 0;
        double qtdVotosB = 0;
        double qtdVotosC = 0;
        double qtdVotosBrancos = 0;
        double qtdVotosNulo = 0;

        double qtdVotosValidos = 0;

        System.out.print("Informe a quantidade de votos de candidato A: ");
        qtdVotosA = leitor.nextDouble();
        
        System.out.print("Informe a quantidade de votos de candidato B: ");
        qtdVotosB = leitor.nextDouble();
        
        System.out.print("Informe a quantidade de votos de candidato C: ");
        qtdVotosC = leitor.nextDouble();

        System.out.print("Informe a quantidade de votos de brancos; ");
        qtdVotosBrancos = leitor.nextDouble();

        System.out.print("Informe a quantidade de votos nulos: ");
        qtdVotosNulo = leitor.nextDouble();

        leitor.close();

        

        

    }
}
