package lista_02;
//16.Faça um programa que imprima na tela apenas os números ímpares entre  1 e 50.
public class Exercicio_16 {

	public static void main(String[] args) {
		
		//i inicia com 1 e sua condicao de parada é 50
		for(int i = 1; i <= 50; i++) {
			//condicao pra saber se é impar
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}

	}

}
