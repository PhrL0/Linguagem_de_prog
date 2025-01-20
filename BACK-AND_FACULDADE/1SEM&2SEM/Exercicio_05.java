package lista_02;
//Imprima os fatoriais de 1 a 10.
public class Exercicio_05 {

	public static void main(String[] args) {
		
		int resultado = 1;
		// i inicia em 1 e sua condicao de parada é em 10
		for(int i = 1; i <= 10; i++) {
			// variavel resultado recebe resultado * a posicao do i
			resultado *= i;
			System.out.println("O fatorial de " + i + " é " + resultado);
			}
		}
	

	}
