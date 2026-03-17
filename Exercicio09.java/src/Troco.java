//Caio Pertence
//Matrícula: 1261935273

import java.util.Scanner;

public class Troco {
    public static void main(String[] args) {
        double precoA;
        double pagamentoB;
        double trocoC;
        Scanner entrada = new Scanner (System.in);

        System.out.println("\n Sistema de troco\n");
        System.out.println("\n Digite o preço do produto: \n");
        precoA = entrada.nextDouble();

        System.out.println("\n Digite o valor pago: \n");
        pagamentoB = entrada.nextDouble();

        trocoC = pagamentoB - precoA;

        if (pagamentoB < precoA) {System.out.println("\n O valor é insuficiente para a compra!\n");

        }else {System.out.println("\n O valor a ser devolvido como troco é de: " + trocoC);

        }
    }
}
