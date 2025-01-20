package poo;
import java.util.Scanner;
public class TesteCasa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		Casa casa1 = new Casa();
		
		double area;
		
		casa1.bairro = "Vila Nery";
		casa1.cor = "Marrom";
		casa1.possuiChurras = false;
		
		
		System.out.print("Digite o comprimento da casa: ");
		casa1.comprimento = scan.nextDouble();
		
		System.out.print("Digite a largura da casa: ");
		casa1.largura = scan.nextDouble();
		
		System.out.println(" ");
		
		System.out.println("O perimetro da casa tem "+ casa1.calcPerimetro(casa1.comprimento,casa1.largura) + " metros.");
		
		area = casa1.calcArea(casa1.comprimento,casa1.largura);
		System.out.println("A casa possui " + area + "m²." );
		
		System.out.printf("O valor desta casa construida no bairro %s custa R$%.2f ", casa1.bairro, casa1.calcPrecoCasa(area));
		

	}

}
