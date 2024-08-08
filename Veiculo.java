package poo;

public class Veiculo {
	//atributos
	int passageiro;
	int capCombustivel;
	int kpl;
	
	//método que exibe a autonomia
	// autonomia() {
		//System.out.println("A autonomia é: " + capCombustivel * kpl);
	//}
	
	int autonomia() {
		return capCombustivel * kpl;
	}

	double combNecessario(int kilometros) {
		return kilometros / kpl;
	}
}
