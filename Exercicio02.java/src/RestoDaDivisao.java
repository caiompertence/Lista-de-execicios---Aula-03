//Nome: Caio Pertence
//Matrícula: 1261935273

import java.util.Scanner;

public class RestoDaDivisao {
    public static void main(String[] args) {
        int numA;
        int numB;
        int resultado;
        int resto;
        Scanner entrada = new Scanner(System.in);

        System.out.println("\n Olá! Este é um sistema para realizar uma divisão entre dois números e mostrar, além de seu resultado inteiro, também seu resto! \n");
        System.out.println("\n Por favor, digite o primeiro número: \n");
        numA = entrada.nextInt();

        System.out.println("\n Por favor, digite o segundo número: \n");
        numB = entrada.nextInt();
        resultado = numA / numB;
        resto = numA % numB;

        System.out.println("\n O resultado inteiro da divisão é: " + resultado);
        System.out.println("\n O resto da divisão é: " + resto);
    }
}
