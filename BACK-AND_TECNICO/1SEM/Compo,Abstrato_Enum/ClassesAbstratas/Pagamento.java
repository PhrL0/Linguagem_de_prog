public abstract class Pagamento {

    protected double valor;

    public Pagamento(double valor){
        this.valor = valor;
    }
    public abstract void processarPagamento();
    public void imprimirRecibo(){
        System.out.println("Recibo gerado. Valor: R$" + valor);
    }
}
