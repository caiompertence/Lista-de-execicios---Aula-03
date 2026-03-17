//Caio Pertence
//Matrícula: 1261935273

import java.util.Scanner;

public class Viagem {
    public static void main(String[] args) {
        double distanciaA;
        double velocidadeB;
        double tempoHoras;
        Scanner entrada = new Scanner (System.in);

        System.out.println("\n Programa para calcular tempo de viagem");
        System.out.println("\n Digite a distância (em km): ");
        distanciaA = entrada.nextDouble();

        System.out.println("\n Digite a velocidade média (em km/h): ");
        velocidadeB = entrada.nextDouble();

        tempoHoras = distanciaA / velocidadeB;
        int horas = (int) tempoHoras;
        int minutos = (int) ((tempoHoras - horas) * 60);

        System.out.println("\n O tempo estimado é de: " + horas);
        System.out.print(" horas e " + minutos);
        System.out.print(" minutos.");  
    }
}
