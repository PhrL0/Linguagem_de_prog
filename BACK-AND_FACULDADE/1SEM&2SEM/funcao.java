package EXERCICIOS;

import java.util.Scanner;

public class funcao {
	
	public static int soma(int a, int b) {
		int c = a + b;
		
		return c;
	}

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite um n�mero:");
		int a = leitor.nextInt();
		
		System.out.print("Digite um n�mero:");
		int b = leitor.nextInt();
		
		System.out.println(soma(a,b));
		
		leitor.close();
		
		
	}

}
