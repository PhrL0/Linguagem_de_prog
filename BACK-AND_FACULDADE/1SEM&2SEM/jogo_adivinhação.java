package EXERCICIOS;

import java.util.Scanner;
import java.util.Random;

public class jogo_adivinhação {

    public static void main(String[] args) {

        Random gerador = new Random();
        Scanner leitor = new Scanner(System.in);

        int numeroAleatorio = gerador.nextInt(10);

        System.out.println("Tente adivinhar o número :P");

        for (int i = 5; i > 0; i--) {

            System.out.print("Digite um número: ");
            int number = leitor.nextInt();

            if (number > numeroAleatorio) {
                System.out.println("O número digitado é maior que o número aleatório");
                System.out.println("Você tem mais " + (i - 1) + " chances");
            } else if (number < numeroAleatorio) {
                System.out.println("O número digitado é menor que o número aleatório");
                System.out.println("Você tem mais " + (i - 1) + " chances");
            } else if (number == numeroAleatorio) {
                System.out.println("Parabéns, você acertou o número!!");
                break; 
            } else {
                System.out.println("Você perdeu :(");
            }
        }

        leitor.close();
    }
}


