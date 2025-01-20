package lista_02;
import java.util.Scanner;
/*Faça um programa que leia um nome de usuário e a sua senha e não
aceite a senha igual ao nome do usuário, mostrando uma mensagem de
erro e voltando a pedir as informações.*/
public class Exercicio_12 {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		//for inicia em 0 e vai e sua condicao de parada é 2
		for(int i = 0; i < 2; i++) {
			
			//input de dados do usuario
			System.out.print("Digite o nome de usuario:");
			String nome = leitor.next();
			
			//input de dados do usuario
			System.out.print("Digite uma senha:");
			String senha = leitor.next();
			
			//condicao de equaldade entre as string 
			if(nome.equals(senha)) {
				System.out.println("Não foi possivel validar, tente novamente");
				//caso a condicao seja satisfeita ele subtrai o i
				i--;
				//com o i subtraido ele volta ao estado normal
				//logo ele fica em um looping por conta do continue
				continue;
			}
			else {
				System.out.println("Sucesso!");
				// caso eles forem diferentes sai do looping
				break;
				
			}
		}
		leitor.close();
	}
}
