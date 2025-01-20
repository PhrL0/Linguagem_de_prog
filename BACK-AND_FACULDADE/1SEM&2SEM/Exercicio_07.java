package lista_02;

public class Exercicio_07 {
//Utilize o comando for para imprimir os 30 primeiros números da série de Fibonacci.
	public static void main(String[] args) {
		
		int a = 0;
		int b = 1;
		//i inicia em 2 e sua condicao de parada é em 30
		for(int i = 2; i < 30; i++) {
			//variavel c recebe valor de A e B em cada iteracao 
			int c = a + b;
			System.out.println(c);
			// A recebe valor B a cada iteracao
			a = b;
			// B recebe valor de C a cada iteracao 
			b = c;
			
		}

	}

}
