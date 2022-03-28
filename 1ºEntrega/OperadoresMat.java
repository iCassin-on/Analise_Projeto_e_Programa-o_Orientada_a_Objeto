//Codigo Java com exemplos de operações matemáticas (07/03/22);
import java.util.Scanner;

public class OperadoresMat {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

    // Solicitando informações
        System.out.println("Digite o primeiro valor:");
        double num1 = entrada.nextInt();

        System.out.println("Digite o segundo valor: ");
        double num2 = entrada.nextInt();

    // Somando os números
       double soma = num1 + num2;

    // Dividindo os numeros
        double div = num1/num2;

    // Subtraindo os numeros
       double sub = num1 - num2;

    // Multiplicando os numeros
       double mult = num1 * num2;

    // Imprimindo os resultados
    System.out.println(" A soma de " + num1 + " e " + num2 + " é igual a: " + soma);
    System.out.println(" A divisão de " + num1 + " e " + num2 + " é igual a: " + div);
    System.out.println(" A Subtração de " + num1 + " e " + num2 + " é igual a: " + sub);
    System.out.println(" A Multiplicação de " + num1 + " e " + num2 + " é igual a: " + mult);

    entrada.close();
    }
}
