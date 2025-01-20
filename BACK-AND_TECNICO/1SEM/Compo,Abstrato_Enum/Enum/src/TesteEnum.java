public class TesteEnum {

    public static void main(String[] args) {

        DiaDaSemana dia = DiaDaSemana.QUARTA;

        if(dia == DiaDaSemana.SABADO || dia == DiaDaSemana.DOMINGO){
            System.out.println("É fim de semana");
        } else {
            System.out.println("Dia de trabalho");
        }

        StatusPedido status = StatusPedido.ENVIADO;

        System.out.println("Status: " + status);
        System.out.println("Código do status: " + status.getCodigo());

        System.out.println("=======================================");


        double resultado = Operacao.SOMA.executar(10,10);
        System.out.println(resultado);

        resultado = Operacao.SUBTRACAO.executar(10,5);
        System.out.println(resultado);
    }
}
