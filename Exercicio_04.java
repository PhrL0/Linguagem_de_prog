package lista_02;
//Imprima todos os múltiplos de 7 entre 1 e 1000.
public class Exercicio_04 {

	public static void main(String[] args) {
		// i inicia em 1 e sua condicao de para é 100
		for(int i = 1; i <= 100; i++) {
			// condicao para verificar se o numero é multiplo de 7
			if(i % 7 == 0) {
				System.out.println(i);
			}
		}


	}

}
