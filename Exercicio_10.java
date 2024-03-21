package lista_02;
/*10.Exiba os números de 1 a 100 classificando como: Par, Ímpar, Múltiplo
de 3 e Múltiplo de 7. Os números deverão ser impressos 1 em cada linha
com sua classificação, insira uma linha em branco a cada 10 números.
*/
public class Exercicio_10 {

	public static void main(String[] args) {
		
		
		// i inicia em 1 e sua condicao de para é em 100
		for(int i = 1; i <= 100; i++) {
			
			//condicao para inserir uma linha branca a cada 10 numeros
			if((i - 1) % 10 == 0) {
				System.out.println(" ");
			}
			
			//condicao para verificar se o numero é par
			if(i % 2 == 0) {
				// se for par, entra no bloco de condicao para verificar se 
				//é multiplo de 3 e multiplo de  7
				if((i % 3 == 0) && (i % 7 == 0)) {
					System.out.println(i + " - " + "par Multiplo de 3 Multiplo de 7");
				}
				//bloco de condicao para verificar se é multiplo apenas de 3
				else if(i % 3 == 0) {
					System.out.println(i + " - " + "par Multiplo de 3");
				}
				//bloco de condicao para verificar se é multiplo apenas de 7
				else if(i % 7 == 0) {
					System.out.println(i + " - " + "par Multiplo de 7");
				}
				else {
					System.out.println(i + " - " + "par");
				}
			}
			//caso entre no else sabemos que o numero é impar
			else {
				//segue a mesma logica de cima o bloco inteiro 
				if((i % 3 == 0) && (i % 7 == 0)) {
					System.out.println(i + " - " + "ímpar Multiplo de 3 Multiplo de 7");
				}
				else if(i % 3 == 0) {
					System.out.println(i + " - " + "ímpar Multiplo de 3");
				}
				else if(i % 7 == 0) {
					System.out.println(i + " - " + "ímpar Multiplo de 7");
				}
				else {
					System.out.println(i + " - " + "ímpar");
				}
			}
			
			
		}

	}

}
