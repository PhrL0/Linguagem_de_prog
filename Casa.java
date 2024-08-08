package poo;

public class Casa {

	String bairro;
	String cor;
	boolean possuiChurras;
	double comprimento;
	double largura;
	
	
	double calcPerimetro(double comprimento, double largura) {
		return (comprimento * 2) + (largura * 2);
	}
	
	double calcArea(double comprimento, double largura) {
		return comprimento * largura;
	}
	
	double calcPrecoCasa(double area) {
		return area * 4500;
	}
}
