//package course;

import java.util.Scanner;

public class Aula1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double x,y, average;
            System.out.print("Enter first number: ");
            x = sc.nextInt();
            System.out.print("Enter second number: ");
            y = sc.nextInt();
            average = (x + y) / 2.0;
            System.out.printf("Average = %.2f%n", average);
            sc.close();
        }
}