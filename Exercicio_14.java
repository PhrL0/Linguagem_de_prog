package lista_02;
/*14.Faça um programa que imprima na tela os números de 1 a 20, um abaixo
do outro e logo em seguida mostre os números um ao lado do outro.*/
public class Exercicio_14 {

	public static void main(String[] args) {
		
		//inicia em 0 e vai até 20
		for(int i = 0; i <= 20; i++) {
			//printa um embaixo do outro
			System.out.println(i);
		}
		//inicia em 0 e vai até 20
		for(int j = 0; j <= 20; j++) {
			//printa um ao lado do outro
			System.out.print(j + " ");
		}

	}

}
