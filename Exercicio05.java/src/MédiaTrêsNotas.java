//Caio Martins Pertence
//Matrícula: 1261935273

import java.util.Scanner;

public class MédiaTrêsNotas {
    public static void main(String[] args) {
        double notaA;
        double notaB;
        double notaC;
        double somaD;
        double mediaE;
        Scanner entrada = new Scanner (System.in);

        System.out.println("\n Programa para calcular a média aritmética entre três notas");
        System.out.println("\n Por favor, digite a primeira nota:\n");
        notaA = entrada.nextDouble();

        System.out.println("\n Por favor, digite a segunda nota: \n");
        notaB = entrada.nextDouble();

        System.out.println("\n Por favor, digite a terceira nota: \n");
        notaC = entrada.nextDouble();

        somaD = notaA + notaB + notaC;
        mediaE = somaD / 3;

        System.out.println("\n Nota 1 = " + notaA);
        System.out.println("\n Nota 2 = " + notaB);
        System.out.println("\n Nota 3 = " + notaC);
        System.out.println("\n Média = " + mediaE);
        System.out.printf("%.2f", mediaE);
    }
}
