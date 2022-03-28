
import java.util.Scanner;

    public class CalculoIMC {

        public static void main(String[] args) {

            Scanner entrada = new Scanner(System.in);

            // solicitando o peso
            System.out.println("Digite seu peso:");
            double peso = entrada.nextDouble();

            // solicitando a altura
            System.out.println("Digite sua altura:");
            double altura = entrada.nextDouble();


            // calculando o imc
            double imc = peso / (altura * altura);

            // imprimindo o resultado
            System.out.printf("O resultado é: %.2f", imc);

        }

    }

