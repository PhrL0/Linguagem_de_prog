package EXERCICIOS;

import java.util.Scanner;

public class desafio_calc {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o primeiro n�mero: ");
        double number1 = leitor.nextDouble();

        System.out.print("Digite o segundo n�mero: ");
        double number2 = leitor.nextDouble();

        System.out.println("Digite a opera��o que deseja: somar, subtrair, dividir ou multiplicar");
        leitor.nextLine(); 
        String operators = leitor.next();

        switch (operators) {
            case "somar":
                System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
                break;

            case "subtrair":
                System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
                break;

            case "dividir":
                System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));
                break;

            case "multiplicar":
                System.out.println(number1 + " x " + number2 + " = " + (number1 * number2));
                break;

            default:
                System.out.println("!!ERROR!!");
                System.out.println("Tente novamente");
        }
        leitor.close();
    }

}

