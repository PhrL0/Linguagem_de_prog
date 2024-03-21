package lista_02;
import java.util.Scanner;
public class Exercicio_19 {
//19.Faça um programa que peça dois números, base e expoente, calcule e
//mostre o primeiro número elevado ao segundo número.
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double conta;
		
		for(int i = 0;i <= 2; i++){
			//input de dados do usuario
			System.out.print("Digite a base:");
			double num1 = leitor.nextDouble();
			
			//input de dados do usuario
			System.out.print("Digite o expoente:");
			double num2 = leitor.nextDouble();
			
			// variavel conta esse a clase math com o metodo pow para calcula a pontencia
			conta = Math.pow(num1,num2);
			System.out.println(num1 + " elevado por " + num2 + " é: " + conta);
			
			//condicao para ficar em looping
			if(conta != 0) {
				i--;
				continue;
			}
			else {
				break;
			}
		}
		leitor.close();
	}
}

