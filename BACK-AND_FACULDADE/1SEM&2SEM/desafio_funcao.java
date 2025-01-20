package EXERCICIOS;

import java.util.Scanner;

public class desafio_funcao {

    public static int funcaoPar(int a) {
        if (a % 2 == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int a = leitor.nextInt();

        int resultado = funcaoPar(a);

        if (resultado == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }

        leitor.close();
    }
}

