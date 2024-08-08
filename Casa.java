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
	
	double calcPrecoCasa(double area,String bairro) {
		double valor = 0 ;
		
		switch(bairro) {
		case "Vila Nery":
			valor = area * 4500;
		case "Vila Prado":
			valor = area * 5000;
		case "Damha":
			valor = area * 10000;
		default:
			System.err.println("Bairro não encontrado na base de dados");
		}
		return valor;
	}
}
