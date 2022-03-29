import java.util.Scanner;
import java.lang.Math;

public class Operacoes {
        public static void main (String[] args){
            double x;
            double y;
            double z;
            double A, B, C;

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter value of first variable: ");
            x = sc.nextInt();
            System.out.print("Enter value of second variable: ");
            y = sc.nextInt();
            System.out.print("Enter value of third variable: ");
            z = sc.nextInt();

    
            A = Math.sqrt(x);
            B = Math.sqrt(y);
            C = Math.sqrt(25.0);
            System.out.println("Square root of first variable " + x + " = " + A);
            System.out.println("Square root of second variable " + y + " = " + B);
            System.out.println("Square root of 25 = " + C);


            A = Math.cbrt(x);
            B = Math.cbrt(y);
            C = Math.cbrt(90.0);
            System.out.println("Root cubic of first variable " + x + " = " + A);
            System.out.println("Root cubic of second variable " + y + " = " + B);
            System.out.println("Raiz cúbica de 90 = " + C);
          
            A = Math.pow(x, y);
            B = Math.pow(x, 2.0);
            C = Math.pow(5.0, 2.0);
            System.out.println(x + " squared " + y + " = " + A);
            System.out.println(x + " squared " + y + " = " + B);
            System.out.println("5 two squared = " + C);
    
            A = Math.abs(y);
            B = Math.abs(z);
            System.out.println("Valor absoluto de " + y + " = " + A);
            System.out.println("Valor absoluto de " + y + " = " + B);


        }


}