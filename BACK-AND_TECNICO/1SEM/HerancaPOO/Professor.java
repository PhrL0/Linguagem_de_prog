public class Professor extends Pessoa {
    private int numeroDeAulas;
    private int quantidadeDeTurmas;
    private String periodo;

//    public Professor(String nome, String cpf, int idade,int numeroDeAulas,int quantidadeDeTurmas, String periodo) {
//        super(nome, cpf, idade);
//        this.numeroDeAulas = numeroDeAulas;
//        this.quantidadeDeTurmas = quantidadeDeTurmas;
//        this.periodo = periodo;
//    }

    public int getNumeroDeAulas() {
        return numeroDeAulas;
    }

    public int getQuantidadeDeTurmas() {
        return quantidadeDeTurmas;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setNumeroDeAulas(int numeroDeAulas) {
        this.numeroDeAulas = numeroDeAulas;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public void setQuantidadeDeTurmas(int quantidadeDeTurmas) {
        this.quantidadeDeTurmas = quantidadeDeTurmas;
    }
}
