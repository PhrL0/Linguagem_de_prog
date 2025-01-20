package lista_02;
//Imprima a soma de 1 até 1000.
public class Exercicio_02 {

	public static void main(String[] args) {
		int soma = 0;
		// i inicia em 1 e sua condicao de parada é em 1000
		for(int i = 1 ; i <= 1000; i++) {
			//variavel soma recebe soma + a posicao do i
			soma += i;
		}
		System.out.println("A soma de 1 até 1000 é : " + soma);
	}

}
