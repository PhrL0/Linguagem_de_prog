public class PagamentoPix extends  Pagamento{
    private String contaBancaria;

    public PagamentoPix(double valor) {
        super(valor);
    }

    @Override
    public void processarPagamento() {
        System.out.println("Processo pagamento via Pix...");

        imprimirRecibo();
    }
}
