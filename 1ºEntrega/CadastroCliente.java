//3) Codigo Java dos exercícios do material de aulas remotas "JAVA_Estrutura_Repetitivas.pdf" (21/03/22):
//- páginas 5 e 6 (estrutura repetitiva WHILE);

import java.util.Scanner;

public class CadastroCliente {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        // Solicitando um valor de entrada
        System.out.println("Quantos clientes deseja cadastrar?");
        int qtdCli = entrada.nextInt();

        // Variavel de controle
        int i = 0;

        // Laço While
        while ( i < qtdCli){

            // Solicitando dados do cliente
            System.out.println("Digite o nome do seu cliente numero " + i + ":");
            String nome = entrada.next();

            System.out.println("Digite a idade do seu cliente numero " + i + ":");
            int idade = entrada.nextInt();

            i++;
        }
        // Mensagem de cadastro
        System.out.println("Clientes cadastrados com sucesso!");
    }
}
