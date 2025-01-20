public class PagamentoCartao extends Pagamento{
    private String numeroCartao;

    public PagamentoCartao(double valor, String numeroCartao) {
        super(valor);
        this.numeroCartao = numeroCartao;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Processo pagamento via Cartão de Crédito...");
        System.out.println("Número do cartão: " + numeroCartao);

        imprimirRecibo();
    }
}
