package EXERCICIOS;

import java.util.Scanner;
import java.util.Random;

public class jogo_adivinha��o {

    public static void main(String[] args) {

        Random gerador = new Random();
        Scanner leitor = new Scanner(System.in);

        int numeroAleatorio = gerador.nextInt(10);

        System.out.println("Tente adivinhar o n�mero :P");

        for (int i = 5; i > 0; i--) {

            System.out.print("Digite um n�mero: ");
            int number = leitor.nextInt();

            if (number > numeroAleatorio) {
                System.out.println("O n�mero digitado � maior que o n�mero aleat�rio");
                System.out.println("Voc� tem mais " + (i - 1) + " chances");
            } else if (number < numeroAleatorio) {
                System.out.println("O n�mero digitado � menor que o n�mero aleat�rio");
                System.out.println("Voc� tem mais " + (i - 1) + " chances");
            } else if (number == numeroAleatorio) {
                System.out.println("Parab�ns, voc� acertou o n�mero!!");
                break; 
            } else {
                System.out.println("Voc� perdeu :(");
            }
        }

        leitor.close();
    }
}


