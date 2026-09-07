package desafioBaskhara;

import java.lang.Math;
/*Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de Bhaskara. Se não for possível calcular as raízes, mostre a mensagem correspondente “Impossivel calcular”, caso haja uma divisão por 0 ou raiz de numero negativo.

Entrada
Leia três valores de ponto flutuante (double) A, B e C.

Saída
Se não houver possibilidade de calcular as raízes, apresente a mensagem "Impossivel calcular". Caso contrário, imprima o resultado das raízes com 5 dígitos após o ponto, com uma mensagem correspondente conforme exemplo abaixo. Imprima sempre o final de linha após cada mensagem.
*/
import java.util.Scanner;
public class desafioBaskhara {
    public static void main(String[] args) {
        double a = 10.0;
        double b = 20.1;
        double c = 0;
        double delta = (b * b) - 4 * (a * c);
        double baskharaPositivo = (-b + Math.sqrt(delta)) / (2 * a);
        double baskharaNegativo = (-b - Math.sqrt(delta)) / (2 * a);

        //to com preguica de pegar input
        if(a<=0||b<=0||c<=0){
            System.out.println("Impossivel calcular");
        }
        else{
            System.out.printf("R1 = %.5f\n", baskharaPositivo);
            System.out.printf("R2 = %.5f", baskharaNegativo);
        }

    }
}
