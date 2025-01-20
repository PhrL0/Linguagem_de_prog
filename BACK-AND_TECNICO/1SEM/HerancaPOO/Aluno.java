public class Aluno extends Pessoa {

    private String identificacao;
    private int anoLetivo;
    private int numeroDeDisciplinas;

//    public Aluno(String nome,String cpf,int idade,String identificacao,int anoLetivo, int numeroDeDisciplinas){
//        super(nome,cpf,idade);
//        this.identificacao = identificacao;
//        this.anoLetivo = anoLetivo;
//        this.numeroDeDisciplinas = numeroDeDisciplinas;
//    }

    public int getNumeroDeDisciplinas() {
        return numeroDeDisciplinas;
    }

    public int getAnoLetivo() {
        return anoLetivo;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setAnoLetivo(int anoLetivo) {
        this.anoLetivo = anoLetivo;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public void setNumeroDeDisciplinas(int numeroDeDisciplinas) {
        this.numeroDeDisciplinas = numeroDeDisciplinas;
    }
}
