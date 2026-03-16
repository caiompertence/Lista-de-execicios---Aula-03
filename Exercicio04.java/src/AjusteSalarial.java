//Nome: Caio Pertence
//Matrícula: 126195273

import java.util.Scanner;

public class AjusteSalarial{
    public static void main(String[] args) {
       double salarioOriginal;
       double salarioNovo;
       Scanner entrada = new Scanner (System.in);
       
       System.out.println("\n Programa para realizar ajuste salarial \n");
       System.out.println("\n Por favor digite o salário atual: \n");
       salarioOriginal = entrada.nextDouble();

       salarioNovo = salarioOriginal * 1.07;

       System.out.println("\n O valor do salário após o ajuste de 7% é igual a: R$" + salarioNovo);
    }
}
