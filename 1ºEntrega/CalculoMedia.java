//3) Codigo Java dos exercícios do material de aulas remotas "JAVA_Estrutura_Repetitivas.pdf" (21/03/22):
//- páginas 11 e 12 (estrutura repetitiva FOR);

import java.util.Arrays;
import java.util.Scanner;

public class CalculoMedia {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Pedindo para o usuário informar a quantidade de notas
        System.out.println("Digite quantas notas serão informadas:");
        int qtd = entrada.nextInt();

        double[] notas = new double[qtd];

        // Inserindo as notas dentro de cada indice
        for (int i = 0; i < notas.length; i++) {

            System.out.printf("Digite a nota numéro [%d]: ", i);
            notas[i] = entrada.nextDouble();
        }

        // Imprindo as notas informadas
        System.out.println("\nAs notas informadas foram: ");
        System.out.println(Arrays.toString(notas));

        // somando

        double soma = 0.0;

        for (double nota : notas) {

            soma = soma + nota;

        }
        // imprimindo a soma
        System.out.println("\nSoma das notas: " + soma);

        // imprimindo a média
        System.out.println("\nMédia: " + soma / notas.length);

        entrada.close();

    }

}
