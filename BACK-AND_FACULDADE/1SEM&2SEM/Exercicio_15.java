package lista_02;
import java.util.Scanner;
//15.Faça um programa que leia 5 números e informe o maior número, a soma
//e a média dos números.
public class Exercicio_15 {

	public static void main(String[] args) {
		int num1 = 0,num2 = 0,num3 = 0,num4 = 0,num5 = 0;
		int soma = 0;
		double media = 0;
		Scanner leitor = new Scanner(System.in);
		
		//i inicia em 1 e sua condicao de parada é 5
		for(int i = 1; i <= 5; i++) {
			System.out.print("Digite um número: ");
			// caso o i seja o que eu desejo, eu aloco o numero digitado na variavel
			// desejada e aloco todos os valores sem  ter que ficar repetindo o sysout
			switch(i){
			case 1:	num1 = leitor.nextInt();
					continue;
			case 2:	num2 = leitor.nextInt();
					continue;
			case 3:	num3 = leitor.nextInt();
					continue;
			case 4:	num4 = leitor.nextInt();
					continue;
			case 5: num5 = leitor.nextInt();
			}
		}
		//bloco inteiro, feito para saber qual é o maior numero entre eles
		if(num1 >= num2 && num1 >= num3 && num1 >= num4 && num1 >= num5) {
			System.out.println(num1 + " é o maior número entre eles");
		}
		else if(num2 >= num1 && num2 >= num3 && num2 >= num4 && num2 >= num5) {
			System.out.println(num2 + " é o maior número entre eles");
		}
		else if(num3 >= num1 && num3 >= num2 && num3 >= num4 && num3 >= num5) {
			System.out.println(num3 + " é o maior número entre eles");
		}
		else if(num4 >= num1 && num4 >= num2 && num4 >= num3 && num4 >= num5) {
			System.out.println(num4 + " é o maior número entre eles");
		}
		else {
			System.out.println(num5 + " é o maior número entre eles");
		}
		// descobrir a soma dos numeros
		soma = num1 + num2 + num3 + num4 + num5;
		System.out.println("A soma entre os número são: " + soma);
		// descobrir a media dos numeros
		media = soma / 5;
		System.out.println("A média dos números  são: " + media);
		
		leitor.close();
	}
}


