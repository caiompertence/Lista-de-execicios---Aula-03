//Caio Pertence
//Matrícula: 1261935273

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        double celsius;
        double fahrenheit;
        double kelvin;
        Scanner entrada = new Scanner (System.in);

        System.out.println("\n Conversor de temperatura");
        System.out.println("\n Digite a temperatura em Celsius:");
        celsius = entrada.nextDouble();

        fahrenheit = (celsius * 9.0 / 5) + 32;
        kelvin = celsius + 273.15;

        System.out.println("\n Fahrenheit = " + fahrenheit);
        System.out.print("°F");
        System.out.println("\n Kelvin = " + kelvin);
        System.out.print("K");
    }
}
