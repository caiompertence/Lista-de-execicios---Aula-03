//Nome: Caio Pertence
//Matrícula: 1261935273

import java.util.Scanner;

public class QuatroOperacoes {
    public static void main(String[] args) {
        double numA;
        double numB;
        double adição;
        double subtração;
        double multiplicação;
        double divisão;
        Scanner entrada = new Scanner(System.in);

        System.out.println("\n Olá! Este é um programa para realizar as quatro principais operaçoes matemáticas!\n");
        System.out.println("\n Por favor, digite o primeiro número: \n");
        numA = entrada.nextDouble();

        System.out.println("\n Por favor, digite o segundo número: \n");
        numB = entrada.nextDouble();

        adição = numA + numB;
        subtração = numA - numB;
        multiplicação = numA * numB;
        divisão = numA / numB;

        System.out.println("\n O resultado da adiçao entre os números é: " + adição);
        System.out.println("\n O resultado da subtraçao entre os números é: " + subtração);
        System.out.println("\n O resultado da multiplicaçao entre os números é: " + multiplicação);
        System.out.println("\n O resultado da divisao entre os números é: " + divisão);

        
        
    }
}
