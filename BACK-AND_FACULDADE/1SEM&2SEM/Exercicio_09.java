package lista_02;

public class Exercicio_09 {
//Com base no exercício anterior, faça um código que calcule o somatório de todos os pesos das posições de 0 a 15.
	public static void main(String[] args) {
		
		int peso = 0;
		
		for(int i = 0; i < 16; i++) {
			peso = (int)(Math.pow(2,i));
			// a variavel peso recebe ele proprio e soma a cada iteracao 
			peso += peso;
		}
		System.out.println(peso);

	}

}
