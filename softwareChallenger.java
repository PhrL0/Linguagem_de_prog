package AULA10;

import java.util.Scanner;
import java.util.Arrays;

public class softwareChallenger {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		int i = 0, min = 0, max = 0, qtdNumeros = 0;
		boolean incorreto;

		do {
			System.out.print("Digite o valor minimo:");
			min = leitor.nextInt();
			System.out.print("Digite o valor maximo:");
			max = leitor.nextInt();

			if (min >= max) {
				System.err.println("Valores invalidos, tente novamente!");
				incorreto = true;
			} else {
				System.out.println("Sucesso!");
				incorreto = false;
			}
		} while (incorreto);

		do {
			System.out.print("Digite a quantidade dos números:");
			qtdNumeros = leitor.nextInt();

			if (qtdNumeros > (max - min + 1)) {
				System.err.println("Tente novamente!");
				incorreto = true;
			} else {
				System.out.println("Sucesso!");
				incorreto = false;
			}
		} while (incorreto);

		int vetor[] = new int[qtdNumeros];
		int copia[] = new int[qtdNumeros];

		for (i = 0; i < qtdNumeros; i++) {
			copia = Arrays.copyOf(vetor, qtdNumeros);
			Arrays.sort(copia);
			do {
				int rand = (int) (Math.round((Math.random() * max)));

				if (rand < min) {
					incorreto = true;
				} else if (Arrays.binarySearch(copia, rand) >= 0) {
					incorreto = true;
				} else if (rand == 20 || rand == 27 || rand == 36 || rand == 37) {
					incorreto = true;
				} else {
					incorreto = false;
					vetor[i] = rand;
				}
			} while (incorreto);
		}
		System.out.println(Arrays.toString(vetor));
		leitor.close();
	}
}
