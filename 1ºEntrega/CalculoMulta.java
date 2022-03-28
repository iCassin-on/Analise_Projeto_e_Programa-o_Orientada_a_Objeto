// Codigo Java dos exercícios do material de aulas remotas "JAVA_Estrutura_Condicional.pdf" (14/03/22):
// página 14 (estrutura condicional IF);

import java.util.Scanner;

public class CalculoMulta {
    // 100 minutos ou menos =  R$50.0
    // Mais de 100min e menor que 200 = R$2.00 por minuto a mais
    // Mais de 200min = R$1.5 por minuto a mais

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a quantidade de minutos realizados:");
        int minutos = entrada.nextInt();

        double conta = 50.0;
        if (minutos > 100 && minutos < 200) {
            conta = conta + (minutos - 100) * 2.0;

            System.out.printf("Você passou %d minutos do limite", minutos - 100);
            System.out.printf("O valor total é: %f", conta);

        } else if ( minutos > 200) {
            conta = conta + (minutos - 100) * 1.5;

            System.out.printf("O valor total da fatura com desconto é: %f", conta);
        }
        entrada.close();

    }
}
