public class TestePagamento {
    public static void main(String[] args) {

        Pagamento pagamentoCartao = new PagamentoCartao(250.75, "123456789");
        pagamentoCartao.processarPagamento();

        Pagamento pagamentoPix = new PagamentoPix(5000);
        pagamentoPix.processarPagamento();


    }

}
