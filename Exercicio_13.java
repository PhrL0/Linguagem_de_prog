package lista_02;
/*Supondo que a população de um país A seja da ordem de 80.000
habitantes com uma taxa anual de crescimento de 3% e que a população
de B seja 200.000 habitantes com uma taxa de crescimento de 1.5%.
Faça um programa que calcule e escreva o número de anos necessários
para que a população do país A ultrapasse ou iguale a população do país
B, mantidas as taxas de crescimento.*/
public class Exercicio_13 {

	public static void main(String[] args) {
		int paisA = 80000;
		int paisB = 200000;
		int j = 0;
		
		// i inicia em 0 e sua condicao de parada é j
		for(int i = 0; i <= j; i++) {
			// variavel paisA recebe a ele mesmo e soma a multiplicacao 
			paisA += (paisA * 0.03);
			// variavel paisB recebe a ele mesmo e soma a multiplicacao
			paisB += (paisB * 0.015);
			
			//condicao para ver se satisfaz o que foi pedido no exercicio
			if(paisA >= paisB) {
				System.out.println("Demorou " + j + " anos");
				//sai do looping
				break;
			}
			else {
				//continua  no looping e fica somando o j
				j++;
				continue;
			}
		}
	
		
	}

}
