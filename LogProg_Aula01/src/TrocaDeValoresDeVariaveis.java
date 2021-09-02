public class TrocaDeValoresDeVariaveis {
    public static void main(String args[]) {
        // Declaração de variaveis
        int variavelA = 0;
        int variavelB = 0;
        int variavelTemp = 0;

        // Entrada de dados
        variavelA = 45;
        variavelB = 17;

        //Processamento
        variavelTemp = variavelA;
        variavelA = variavelB;
        variavelB = variavelTemp;

        //Saida de dados
        System.out.println(variavelA);
        System.out.println(variavelB);

    }
}
