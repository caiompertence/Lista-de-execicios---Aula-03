//Caio Pertence
//Matrícula 1261935273

import java.util.Scanner;

public class Combustivel {
    public static void main(String[] args) {
        double distanciaA;
        double combustivelB;
        double consumoC;
        Scanner entrada = new Scanner (System.in);

        System.out.println("\n Programa para calcular consumo médio de combustível\n");
        System.out.println("\n Digite a distância percorrida (em quilômetros): ");
        distanciaA = entrada.nextDouble();

        System.out.println("\n Digite o combustível gasto (em litros): \n");
        combustivelB = entrada.nextDouble();

        consumoC = distanciaA / combustivelB;

        System.out.println("\n O consumo médio de combustível foi: " + consumoC);
        System.out.print("km/l");
    }
}
