//Codigo Java dos exercícios do material de aulas remotas "JAVA_Estrutura_Condicional.pdf" (14/03/22):
//- página 16 (estrutura condicional switch case);
import java.util.Scanner;

public class Produtos {

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        // Solicitando uma entrada do usuário
        System.out.println("Seja bem vindo(a) a nossa loja!\n");
        System.out.println("Selecione uma das opções:\n" +
                "OPÇÃO A - Produtos Eletrônicos\n" +
                "OPÇÃO B - Material Escolar");

        String opcao = entrada.nextLine();
        opcao = opcao.toUpperCase();

        // Estrutura Switch case
        switch (opcao){
            case "A" :
                System.out.println("Produto - Preço \n" +
                        "------------------- \n" +
                        "Fone - R$50,00 \n" +
                        "Mouse - R$80,00\n" +
                        "Teclado - R$150,00\n");
                break;

            case "B":
                System.out.println("Produto - Preço \n" +
                        "--------------------\n" +
                        "Pc Papel Sulfite - R$25,00\n" +
                        "Cx Lápis de cor - R$40,00\n" +
                        "Kit Réguas - R$ 35,00");
                break;
        }
    }
}
