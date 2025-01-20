package lista_02;
//Imprima todos os múltiplos de 3 entre 1 e 100.
public class Exercicio_03 {

	public static void main(String[] args) {
		// i inicia em 1 e sua condicao de para é 100
		for(int i = 1; i <= 100; i++) {
			// condicao para verificar se o numero é multiplo de 3
			if(i % 3 == 0) {
				System.out.println(i);
			}
		}

	}

}
