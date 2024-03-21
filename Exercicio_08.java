package lista_02;

public class Exercicio_08 {
//Faça um código que exiba os pesos das 16 primeiras posições dos dígitos binários.
//A cada quatro linhas deverá ser inserida uma linha em branco. Utilize o comando for.
	public static void main(String[] args) {
		
		int peso;
		//i inicia em 1 e sua condicao de parada é em 16
		for(int i = 1; i <= 16; i++) {
			//a variavel peso está recebendo a classe Math e o metodo pow
			// porém essas propriedades sao do tipo float logo é necessario
			// fazer o casting para inteiro
			//math pow é utilizado para calcular a potencia de algo
			peso = (int)(Math.pow(2, i));
			System.out.println(peso);
			
			//condicao para verificar se deve ser inserido uma linha branca a cada 4 linhas
			if((i + 1) % 4 == 0) {
				System.out.println(" ");
			}
		}

	}

}
