package lista_02;
import java.util.Scanner;
public class Exercicio_18 {
/*18.Desenvolva um gerador de tabuada, capaz de gerar a tabuada de
	qualquer número inteiro entre 0 e 10. O usuário deve informar de qual
	número ele deseja ver a tabuada.*/
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		//input do usuario
		System.out.print("Digite a tabua que queira ver:");
		int tabuada = leitor.nextInt();
		
		//for inicia em 1 e sua condicao de parada é 10
		for(int i = 1; i <= 10; i++) {
			
			//caso o numero digitado for um dos casos ele imprime 
			//diferentes tabuadas
			switch(tabuada) {
			case 1:
				System.out.println(1 + " x " + i + " = " + 1 * i);
				break;
			case 2:
				System.out.println(2 + " x " + i + " = " + 2 * i);
				break;
			case 3:
				System.out.println(3 + " x " + i + " = " + 3 * i);
				break;
			case 4:
				System.out.println(4 + " x " + i + " = " + 4 * i);
				break;
			case 5:
				System.out.println(5 + " x " + i + " = " + 5 * i);
				break;
			case 6:
				System.out.println(6 + " x " + i + " = " + 6 * i);
				break;
			case 7:
				System.out.println(7 + " x " + i + " = " + 7 * i);
				break;
			case 8:
				System.out.println(8 + " x " + i + " = " + 8 * i);
				break;
			case 9:
				System.out.println(9 + " x " + i + " = " + 9 * i);
				break;
			case 10:
				System.out.println(10 + " x " + i + " = " + 10 * i);
				break;
			default:
				System.out.println("ERROR");
			}	
		}
		leitor.close();	
		}
}