//Nome: Caio Pertence
//Matrícula: 1261935273
import java.util.Scanner;

public class Conversordolarreal{
    public static void main(String[] args) {
        double valorDolar;
        double valorConvertido;
        Scanner entrada = new Scanner(System.in);

        System.out.println("\n Programa para converter valores em dólar para real \n");
        System.out.println("\n Insira o valor em dólar: \n");
        valorDolar = entrada.nextDouble();
        
        valorConvertido = valorDolar * 4.95;
        
        System.out.println("\n O valor convertido é igual a: R$" + valorConvertido);
    }
}
