//Caio Pertence
//Matrícula: 1261935273

import java.util.Scanner;

public class AreaRetangulo {
    public static void main(String[] args) {
       double base;
       double altura;
       double area;
       Scanner entrada = new Scanner(System.in);

       System.out.println("\n Programa para calcular a área de um retângulo\n");
       System.out.println("\n Por favor, digite o valor da base do retângulo (em centímetros): \n");
       base = entrada.nextDouble();

       System.out.println("\n Por favor, digite o valor da altura do retângulo (em centímetros): \n");
       altura = entrada.nextDouble();

       area = base * altura;

       System.out.println("\n A área do retângulo dadas as medidas anteriores é igual a ");
       System.out.printf("%.2f", area);
       System.out.print(" cm²");
    }
}
