package lista_02;
import java.util.Scanner;
public class Exercicio_11 {
/*11.Faça um programa que peça uma nota, entre zero e dez. Mostre uma
 * mensagem caso o valor seja inválido e continue pedindo até que o usuário
	informe um valor válido.
*/
	public static void main(String[] args) {
		
		int nota;
		
		Scanner leitor = new Scanner(System.in);
		//i inicia em 0 e sua condicao de para é 2
		for(int i = 0; i <= 2; i++) {
			
			// input do usuario
			System.out.print("Digite uma nota de 0 a 10:");
			nota = leitor.nextInt();
			
			// condicao se a nota satisfaz o que queremos, se estiver no intervalor
			// de 0 a 10
			if(nota >=0 && nota <=10) {
				System.out.println("Nota válida, obrigado!");
				// caso é satisfeita ele sai do looping
				break;
			}
			else {
				System.out.println("Nota inválida, tente novamente!");
				//caso a pessoa nao digite no intervalo que queremos
				// o i subtrai 1 fazendo que com que ele volte ao estado inicial
				i--;
				//com o i em seu estado inicial ele executa o codigo novamente
				// assim ficando em um looping até digitar certo
				continue;
			}
		}
		leitor.close();	
	}
}
