package poo;

public class TesteVeiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Veiculo fusca = new Veiculo();
		Veiculo mcLarenSenna = new Veiculo();
		
		int autonomia, autonomia2;
		double litros;
		int distancia = 300;
		
		fusca.passageiro = 5;
		fusca.capCombustivel = 30;
		fusca.kpl = 3;
		
		mcLarenSenna.passageiro = 2;
		mcLarenSenna.capCombustivel = 50;
		mcLarenSenna.kpl = 1;
		
		autonomia = fusca.capCombustivel * fusca.kpl;
		autonomia2 = mcLarenSenna.capCombustivel * mcLarenSenna.kpl;
		
		System.out.println("Meu fusca pode carregar " + fusca.passageiro + " passageiro. ");
		System.out.println("Um Fusca tem uma autonomia de " + fusca.autonomia() + " Km.");
		
		System.out.println("Minha McLaren faz " + autonomia2 + "km com o tanque cheio.");
		System.out.println("Uma McLarenSenna tem uma autonomia de " + mcLarenSenna.autonomia() + " Km.");
		
		litros = fusca.combNecessario(distancia);
		System.out.println("Para percorrer " + distancia + "Km um Fusca precisa de " + litros + " litros.");
		litros = mcLarenSenna.combNecessario(distancia);
		System.out.println("Para percorrer " + distancia + "Km uma McLarenSenna precisa de " + litros + " litros.");
		

	}

}
