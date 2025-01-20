public class Computador {
    private Processador processador;
    private Memoria memoria;

    public Computador(String modeloProcessador, int capacidadeMemoria){
        this.processador  = new Processador(modeloProcessador);
        this.memoria = new Memoria(capacidadeMemoria);
    }

    public void mostrarConfiguracao(){
        System.out.println("Processador: " + processador.getModelo());
        System.out.println("Memoria RAM: " + memoria.getCapacidade());
    }
}
