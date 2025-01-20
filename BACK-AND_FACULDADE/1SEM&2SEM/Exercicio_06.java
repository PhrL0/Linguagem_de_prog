package lista_02;

public class Exercicio_06 {
/* Os tipo primitivos possuem limitações de maximo de valores,
 * por exemplo o tipo primitivo Int que foi usado no primeiro suporta valores até
 * 8 bits, porém quando aumentamos para aparecer os fatoriais até 20, o valor "real"
 * passa desses 32 bits assim consequêntimente faz com que os valores mostrados na tela
 * são totalmente errados. Porém quando colocamos o "Long" ele realmente mostra o número
 * real, porque o Long tem 64 bits, ele suporta mais casas decimais.
 */
	public static void main(String[] args) {
		long resultado = 1;
		for(int i = 1; i <= 20; i++) {
			resultado *= i;
			System.out.println("O fatorial de " + i + " é " + resultado);
			}
	}

}
