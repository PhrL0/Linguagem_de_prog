package lista_02;
import java.util.Scanner;
//20.Sendo H = 1 + 1/2 + 1/3 + 1/4 + ... + 1/n, faça um programa que calcule o
//valor de H com n termos.
public class Exercicio_20 {
	public static void main(String[] args) {
	
		Scanner leitor = new Scanner(System.in);
		double h = 0;
		
		//input de dados do usuario
		System.out.print("Digite o número de termos: ");
		int n = leitor.nextInt();
		
		//for inicia em em 1 e condicao de para em N (valor a ser digitado)
		for(int i = 1; i <= n;i++) {
			//variavel h recebe eles mesmo + a divisao
			h += 1.0 / i; 
		}
		System.out.println("O valor de H com " + n + " termos é: " + h);
		leitor.close();

	}

}
