package lista_02;
import java.util.Scanner;
public class Exercicio_17 {
//17.Faça um programa que receba dois números inteiros e imprima os
//números inteiros que estão no intervalo compreendido por eles.
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		//input de dados do usuario
		System.out.print("Digite um numero inteiro:");
		int num1 = leitor.nextInt();
		
		//input de dados do usuario
		System.out.print("Digite outro numero inteiro:");
		int num2 = leitor.nextInt();
		
		// i inicia com o valor de num1 e sua condicao de parada é o num2
		for(int i = num1; i <= num2; i++) {
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
		leitor.close();
	}

}
